package com.adaming.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

public class AppBatch {

	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/module-context.xml");
		//JobRepository jobrep = (JobRepository) context.getBean("jobRepository");
		Job job = (Job) context.getBean("job2");
		JobLauncher joblau = (JobLauncher) context.getBean("jobLauncher");
		JobExecution jobex = joblau.run(job, new JobParameters());
		System.out.println("Exit status :" + jobex.getStatus());
		
	   

		
	}

}
