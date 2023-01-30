package com.adobe.aem.guides.wknd.core.schedulers;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
    name = "mokhtar scheduler configuration",
    description = "Sling scheduler configuration"
)
public @interface SchedulerConfiguration {
    @AttributeDefinition(
        name = "Scheduler name",
        description = "Name of the scheduler",
        type = AttributeType.STRING
    )
    public String schedulerName() default "Custom Sling Scheduler configuration";
    @AttributeDefinition(
        name = "Cron Expression ",
        description = "Cron expression used by the scheduler",
        type = AttributeType.STRING
    )
    public String cronExpression() default "0/20 * * * * ?"; 
        // runs every 10 second
    
    
}
