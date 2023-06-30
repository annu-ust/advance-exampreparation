package com.example.project5Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class Project5ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project5ConsumerApplication.class, args);
	}
  @Bean
  public RestTemplate makeTemplate() {
		return new RestTemplate();
	}

}
