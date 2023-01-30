package com.adobe.aem.guides.wknd.core.servlets;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.osgi.service.component.annotations.Reference;
import com.adobe.aem.guides.wknd.core.services.InfoSaveInNodeService;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
@Component(service = Servlet.class)
@SlingServletPaths(value = { "/bin/savedatainnode" })
public class InfoSaveInNodeServiceServlet  extends SlingAllMethodsServlet{
    private static final Logger LOG = LoggerFactory.getLogger(InfoSaveInNodeServiceServlet.class);
    @Reference
    InfoSaveInNodeService infoSaveInNodeService;
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        try {

            String fname = request.getRequestParameter("fname").getString();
            String lname = request.getRequestParameter("lname").getString();
            String getData = infoSaveInNodeService.saveDataInNode(fname,lname);
            response.getWriter().write(getData);

        } catch (Exception e) {
            LOG.info("\n ERROR {} ", e.getMessage());
        }

    }
    
}
