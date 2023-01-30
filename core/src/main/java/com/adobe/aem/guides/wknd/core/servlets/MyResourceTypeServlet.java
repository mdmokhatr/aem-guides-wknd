package com.adobe.aem.guides.wknd.core.servlets;
import com.adobe.aem.guides.wknd.core.services.OSGiConfig;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(service = Servlet.class)
@SlingServletResourceTypes(resourceTypes = "wknd/components/page",selectors = "shah",extensions = "xml")
// @SlingServletPaths(
//     value = "/md/nodeservlet1")
public class MyResourceTypeServlet extends SlingAllMethodsServlet {
  private static final Logger log = LoggerFactory.getLogger(MyResourceTypeServlet.class);
private static final long serialVersionUID = -1L;
    @Reference
    OSGiConfig osGiConfig;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
         String str = osGiConfig.getServiceName();
        resp.getWriter().write(str);
    }
}