package com.example.awsjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.awsjob")
public class AwsJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsJobApplication.class, args);
	}

}
