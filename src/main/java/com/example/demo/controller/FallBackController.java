package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RefreshScope
public class FallBackController {

 
	
	@GetMapping("/employeeFallback")	
	public String employeeServicellFallback() {
		System.out.print("employeeCalled");
		return "fallback to employee service due to service unavailbility working";

	}

	@GetMapping("/departmentFallback")
	public String departmentServiceFallback() {
		System.out.print("departmentcalled");
		return "fallback to department service due to service unavailbility";
	}
	

	

}
