package Quartz.Quartz.Job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job  {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO 自动生成的方法存根
		System.out.print("开始job任务！");
	}

}
