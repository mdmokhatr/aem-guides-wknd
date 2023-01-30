package com.adobe.aem.guides.wknd.core.schedulers;
import org.slf4j.*;
import org.slf4j.LoggerFactory;
import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
@Component(immediate = true, service = Runnable.class)
@Designate(ocd = SchedulerConfiguration.class)
public class MyScheduler implements Runnable {
    private final Logger logger = LoggerFactory.getLogger(MyScheduler.class);

    private int schedulerId;

    @Reference
    private Scheduler scheduler;
    
    @Activate
    protected void activate(SchedulerConfiguration config) {
        schedulerId = config.schedulerName().hashCode();
        addScheduler(config);
    }

    private void addScheduler(SchedulerConfiguration config) {
        ScheduleOptions scheduleOptions = scheduler.EXPR(config.cronExpression());
        scheduleOptions.name(String.valueOf(schedulerId));
        scheduleOptions.canRunConcurrently(false);
        scheduler.schedule(this, scheduleOptions);
        logger.info("\n-------- Shedule added ");
        // ScheduleOptions scheduleOptionsNow = scheduler.NOW(3,5);
        // scheduler.schedule(this, scheduleOptionsNow);

    }

    @Deactivate
    protected void Deactivate(SchedulerConfiguration config) {
        removeScheduler();
    }

    private void removeScheduler() {
        scheduler.unschedule(String.valueOf(schedulerId));
    }

    public void run() {
        logger.info("\n ----------run method execute");
    }

    

}
