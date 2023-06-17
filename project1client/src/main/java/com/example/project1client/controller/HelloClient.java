package com.example.project1client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class HelloClient {
 @Autowired
 RestTemplate restTemplate;

 @GetMapping("/call")
 public String callServer() { 
	 String url="http://localhost:8096/server"; 
     String output=restTemplate.getForObject(url, String.class); 
    return output;
}
@GetMapping("/status")
public String status() {
	String url="http://localhost:8096/server/status";
	ResponseEntity<String> response= restTemplate.getForEntity(url, String.class);
	 String productsJson = response.getBody();
     return productsJson;
 
}
@GetMapping("/get")
public String callhelloserver() { 
	 String url="http://localhost:8096/helloserver"; 
    String output=restTemplate.getForObject(url, String.class); 
   return output;
}
@GetMapping("/hellostatus")
public String helloserverstatus() {
	String url="http://localhost:8096/helloserver/status";
	ResponseEntity<String> response= restTemplate.getForEntity(url, String.class);
	 String productsJson = response.getBody();
    return productsJson;
}



}
