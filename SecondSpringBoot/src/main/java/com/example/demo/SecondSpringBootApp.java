package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SecondSpringBootApp {

	public SecondSpringBootApp() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/sayMessage")
	public String getMessage()
	{	return "Hello spring boot!!";
		
	}
	
	@RequestMapping("/byeMessage")
	public String getByeMessage()
	{	return "Bye spring boot!!";
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SecondSpringBootApp.class, args);

	}

}
