package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class FallBackController {

	@GetMapping("/employeeFallback")	
	public String employeeServicellFallback() {
		System.out.print("employeeCalled");
		return "fallback to employee service due to service unavailbility working";

	}

	@GetMapping("/departmentFallback")
	//@CircuitBreaker(name="CircuitBreaker")
	public String departmentServiceFallback() {
		return "fallback to department service due to service unavailbility";
	}
	

	

}
