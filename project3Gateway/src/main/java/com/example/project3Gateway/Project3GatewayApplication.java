package com.example.project3Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Project3GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project3GatewayApplication.class, args);
	}

}
/*An API Gateway is a single entry & exit point to multiple microservices 
 * for an external application/client. API Gateway validates the authentication,
 *  uses its intelligence & routes the client request to the appropriate service 
 *  to process accordingly. Apart from the security & routing, it helps in
 *   monitoring/metrics, and resiliency.*/