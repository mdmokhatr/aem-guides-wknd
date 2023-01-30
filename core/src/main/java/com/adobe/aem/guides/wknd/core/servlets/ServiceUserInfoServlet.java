package com.adobe.aem.guides.wknd.core.servlets;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.guides.wknd.core.services.ServiceUserInfo;
@Component(service = Servlet.class, property = { Constants.SERVICE_DESCRIPTION + "= User Data ",

        "sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.paths=" + "/bin/data" })
public class ServiceUserInfoServlet extends SlingAllMethodsServlet {
    private static final Logger LOG = LoggerFactory.getLogger(ServiceUserInfoServlet.class);

    @Reference
    ServiceUserInfo serviceUserInfo;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        try {

            String fname = request.getRequestParameter("fname").getString();
            String lname = request.getRequestParameter("lname").getString();
            String password = request.getRequestParameter("password").getString();
            String confpassword = request.getRequestParameter("confpassword").getString();

            if (password.equals(confpassword)) {

                String getData = serviceUserInfo.addUser(fname, lname, password, confpassword);
                response.getWriter().write(getData);

                response.getWriter().write(confpassword);

            } else {
                response.getWriter().write("Password not matched with confirm password");
            }

        } catch (Exception e) {
            LOG.info("\n ERROR {} ", e.getMessage());
        }

    }

    
}
