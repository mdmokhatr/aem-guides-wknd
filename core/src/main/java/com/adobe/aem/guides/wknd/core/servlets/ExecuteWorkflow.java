package com.adobe.aem.guides.wknd.core.servlets;
import java.io.IOException;
import javax.servlet.Servlet;
import com.day.cq.workflow.model.WorkflowModel ; 
import com.day.cq.workflow.WorkflowSession; 
import com.day.cq.workflow.exec.WorkflowData; 
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.xfa.ut.StringUtils;
@Component(service = Servlet.class)
@SlingServletPaths(
    value = "/bin/executeworkflow"
)
public class ExecuteWorkflow  extends SlingAllMethodsServlet{
    private static final Logger LOG = LoggerFactory.getLogger(NodeServiceServlet.class);
    
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException{
        String status = "workflow executing ";
        final ResourceResolver resourceResolver = request.getResourceResolver();
        String payload = request.getRequestParameter("page").getString();
        try{
            if(StringUtils.isEmpty(payload)){
             WorkflowSession workflowSession = resourceResolver.adaptTo(WorkflowSession.class);
             WorkflowModel workflowModel     = (WorkflowModel) workflowSession.getModel("/var/workflow/models/demomodel");
             WorkflowData workflowData = (WorkflowData) workflowSession.newWorkflowData("JCR_PATH", payload);
             status =  workflowSession.startWorkflow(workflowModel, workflowData).getState();
            }
        }catch(Exception e){
            LOG.info("\n ERROR in workflow {}", e.getMessage());
        }
        response.getWriter().write(status);
    }

}
