package com.example.project1MS1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Project1Ms1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Ms1Application.class, args);
	}

}
