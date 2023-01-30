package com.adobe.aem.guides.wknd.core.servlets;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import com.day.cq.commons.jcr.JcrConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class)
@SlingServletResourceTypes(
    resourceTypes = "wknd/components/page",
    selectors = {"md","mokhtar"},
    extensions = {"txt","xml"}
    
)
public class ResourceTypeServlet extends SlingSafeMethodsServlet{
    private static final Logger log = LoggerFactory.getLogger(ResourceTypeServlet.class);

    @Override
    protected void doGet(final SlingHttpServletRequest req,final SlingHttpServletResponse res) throws ServletException,IOException{
        final Resource resource = req.getResource();
        res.setContentType("text/plain");
        res.getWriter().write("page Title = "+resource.getValueMap().get(JcrConstants.JCR_TITLE));
    }
    
}
