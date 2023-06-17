package com.example.project1client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Project1clientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project1clientApplication.class, args);
	}
	
	@Bean
	public RestTemplate makeTemplate() {
		return new RestTemplate();
	}

}
