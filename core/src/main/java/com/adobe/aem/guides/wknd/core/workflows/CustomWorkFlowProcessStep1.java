package com.adobe.aem.guides.wknd.core.workflows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.osgi.service.component.annotations.Component;
import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
 
@Component(service= WorkflowProcess.class,
            property = {"process.label = "+"Custom Workflow process step 1"})
public class CustomWorkFlowProcessStep1 implements WorkflowProcess {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomWorkFlowProcessStep1.class);
    Date date = new Date(0);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss azz");
    @Override
    public void execute(WorkItem item, WorkflowSession session, MetaDataMap args) throws WorkflowException {
        LOGGER.info("Logger is working ");
        String payLoadType = item.getWorkflowData().getPayloadType();
        MetaDataMap map = item.getWorkflow().getWorkflowData().getMetaDataMap();
        map.put("Key1", "Value1-"+simpleDateFormat.format(date));
        LOGGER.debug("value is set in Metadata using java code ");
        
    }
    
}
