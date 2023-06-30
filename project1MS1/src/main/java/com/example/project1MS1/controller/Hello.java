package com.example.project1MS1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class Hello {
	 @Value("message")//giving default value 
	  String strMessage;
	  @GetMapping
	  public String Welcome() {
	     return "programming Microservices"+" "+strMessage;
	     }
	  @GetMapping("/status")
	  public String status() {
		  return "Up and Running->>";
	  }
	  
}
