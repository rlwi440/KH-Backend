package ranking.scheduler;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class MyMainScheduler {

	public static void main(String[] args) throws SchedulerException{
		JobDetail j = JobBuilder.newJob(MyObject.class).build();
		Trigger t = TriggerBuilder.newTrigger().withIdentity("CroneTrigger")
					.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(05)
							.repeatForever()).build();
		
		Scheduler s = StdSchedulerFactory.getDefaultScheduler();
		s.start();
		s.scheduleJob(j, t);
	}
}
