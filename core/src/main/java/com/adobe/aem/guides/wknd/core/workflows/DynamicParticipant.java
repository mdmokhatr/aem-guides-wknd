package com.adobe.aem.guides.wknd.core.workflows;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.ParticipantStepChooser;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.metadata.MetaDataMap;

@Component(service = ParticipantStepChooser.class, property = { "chooser.label=" + "Dynamic Participant Step Example" })
public class DynamicParticipant implements ParticipantStepChooser {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getParticipant(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap args)
            throws WorkflowException {
                log.info("\n ===================== Inside Dynamic Participant Step class ============================ ");
        return "mdmokhtar";
    }
    
}
