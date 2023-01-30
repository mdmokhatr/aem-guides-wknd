package com.adobe.aem.guides.wknd.core.workflows;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
 
@Component(service= WorkflowProcess.class,
            property = {"process.label = "+"Custom Workflow process step 2"})
public class CustomWorkFlowProcessStep2 implements WorkflowProcess {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomWorkFlowProcessStep1.class);
    @Override
    public void execute(WorkItem item, WorkflowSession session, MetaDataMap args) throws WorkflowException {
        // LOGGER.info("\n ==============INSIDE ACTIVATE================");
        String payLoadType = item.getWorkflowData().getPayloadType();
        MetaDataMap map = item.getWorkflow().getWorkflowData().getMetaDataMap();
        String value = map.get("Key1","default value ");
        LOGGER.debug(" value  Access in the second workflow step is {}",value);
    }
    
}
