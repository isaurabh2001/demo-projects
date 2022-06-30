package com.example.awsjob.service;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class AwsJobService {
	
	ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
	public String submitAwsJob(String awsBucketId) {
		Runnable awsDeleteBucketJob = () -> {
			System.out.println("-------------START DELETION of awsBucketId :" + awsBucketId + "-----------");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("-------------End DELETION of awsBucketId :" + awsBucketId + "-----------");
		};
		executor.submit(awsDeleteBucketJob);

		return "AWS Job Submitted with JobId :" + awsBucketId;
	}
	
	public void executeSubmittedAwsJob() {
		
	}
	
}
