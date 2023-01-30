package com.adobe.aem.guides.wknd.core.servlets;
import org.apache.sling.servlets.annotations.SlingServletPaths;
// import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.jcr.Node;
import javax.jcr.Session;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
@Component(service = Servlet.class)
 @SlingServletPaths(
    value = "/md/nodeservlet")
// @SlingServletResourceTypes(resourceTypes = "wknd/components/page", selectors = "myservlet1", extensions = "xml")
@ServiceDescription("Node servlet")
public class NodeServlet extends SlingAllMethodsServlet {
    
    
    // private ResourceResolver resourceResolver;

    // private Resource resource;

    private PrintWriter responseWriter;
    
  private static final Logger log = LoggerFactory.getLogger(NodeServlet.class);
private static final long serialVersionUID = -1L;
  @Override
  protected void doGet(
    SlingHttpServletRequest request,
    SlingHttpServletResponse response
  )

    throws ServletException, IOException {
    log.info("Hello");
    

    try {
      log.info("Hello");
      response.getWriter().println("servlet run successfully....");

      response.setContentType("text/plain");

      ResourceResolver resourceResolver = request.getResourceResolver();

      //   resource = request.getResource();

      responseWriter = response.getWriter();

      Session session = resourceResolver.adaptTo(Session.class);
      Resource resource1 = resourceResolver.getResource(
        "/apps/wknd/components/checkbox"
      );
     

      Node node1 = resource1.adaptTo(Node.class);

      node1.setProperty("property", "name");
      node1.setProperty("title", "sampletitle");

      // node1.getSession().save();
      // node1.getProperties("title");
      node1.addNode("Nodesample");
   
      response.getWriter().println("Node 1 added Successfully....");

      response.setContentType("text/plain");

     
      Node node2 = resource1.adaptTo(Node.class);

      node2.setProperty("property 2", "property 2");
      node2.setProperty("title 2", "sampletitle");

    
      // node1.getProperties("title");
   
      node2.addNode("Nodesample2");

      response.getWriter().println("Node 2 added Successfully");

      response.setContentType("text/plain");

      Node node3 = resource1.adaptTo(Node.class);

      node3.setProperty("property 3", "Proterty 3 ");
      node3.setProperty("title 3", "sampletitle 3 ");

     
      // node1.getProperties("title");
   
      node3.addNode("Nodesample3");
      // node1.addNode("Nodesample2");

      response.getWriter().println("Node 3 added Successfully");

      response.setContentType("text/plain");
      session.save();
        //resourceResolver.create(arg0, arg1, arg2)

    }

    catch (final Exception e)

    {

        responseWriter.write("ERROR: " + e.getMessage() + " , " + e.getClass());

    }

}
  
    
}
