package com.adaming.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class task implements Tasklet{
	
	public void oui() {
		
		System.out.println("ciao");
		
		return ;
		
	}

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Coucou pouet, je suis la tasklet carrée");
		
		oui();
			
			
		
		return RepeatStatus.FINISHED;
		
		
		
		
	}
	
		
		
		
		
	}
	


