package com.adobe.aem.guides.wknd.core.servlets;
import org.apache.sling.servlets.annotations.SlingServletPaths;
// import com.google.gson.JsonObject;
import java.io.IOException;
import javax.servlet.Servlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.aem.guides.wknd.core.services.NodeService;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
@Component(service = Servlet.class)
 @SlingServletPaths(
    value = "/bin/myservlet")
    @ServiceDescription("Node servlet")
public class NodeServiceServlet extends SlingAllMethodsServlet {
    private static final Logger LOG = LoggerFactory.getLogger(NodeServiceServlet.class);
    @Reference
    NodeService nodeService;
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        try{
            String path = request.getRequestParameter("path").getString();
            String nodeName = request.getRequestParameter("nodeName").getString();
            String getData = nodeService.createNode(path, nodeName);
            response.getWriter().write(getData);
            // response.getWriter().write("Node is created sucessfully");
        }
        catch (Exception e) {
            LOG.info("\n ERROR {} ", e.getMessage());
        }
        
    }

    
}
