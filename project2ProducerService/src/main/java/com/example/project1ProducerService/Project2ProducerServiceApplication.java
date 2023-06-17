package com.example.project1ProducerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Project2ProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2ProducerServiceApplication.class, args);
	}

}
