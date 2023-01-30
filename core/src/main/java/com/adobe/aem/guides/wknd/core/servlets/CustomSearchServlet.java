package com.adobe.aem.guides.wknd.core.servlets;

import org.apache.sling.servlets.annotations.SlingServletPaths;
// import com.google.gson.JsonObject;
import java.io.IOException;
import javax.servlet.Servlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import com.adobe.aem.guides.wknd.core.models.DTO.CustomSearchDTO;
import com.adobe.aem.guides.wknd.core.services.CustomSearchService;

import org.apache.sling.api.servlets.SlingAllMethodsServlet;

//list to json

import com.fasterxml.jackson.databind.ObjectWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component(service = Servlet.class)
@SlingServletPaths(value = "/bin/search")

public class CustomSearchServlet extends SlingAllMethodsServlet {
    private static final Logger LOG = LoggerFactory.getLogger(NodeServiceServlet.class);

    @Reference
    CustomSearchService customSearchService;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {

        List<CustomSearchDTO> result = customSearchService.getResults(request);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

        String fResultsJson = ow.writeValueAsString(result);

        response.setContentType("application/json");
        response.getWriter().write(fResultsJson);

    }

}
