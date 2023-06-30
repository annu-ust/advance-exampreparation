package com.example.project5MS1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Project5Ms1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project5Ms1Application.class, args);
	}

}
