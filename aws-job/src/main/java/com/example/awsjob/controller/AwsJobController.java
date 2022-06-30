package com.example.awsjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.awsjob.service.AwsJobService;

@RestController
public class AwsJobController {
	
	@Autowired
	private AwsJobService awsJobService;
	
	@GetMapping(path = "/submitAwsJob/{awsBucketId}")
	public String executeAwsJob(@PathVariable String awsBucketId) {
		return awsJobService.submitAwsJob(awsBucketId);
	}

}
