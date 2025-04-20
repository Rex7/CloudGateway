package com.example.demo.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class FallBackController {


    @GetMapping("/order-fallback")
    public ResponseEntity<String> orderFallback() {
        return ResponseEntity.ok("Order Service is currently unavailable. Please try again later.");
    }

    @PostMapping("/payment-fallback")
    public ResponseEntity<String> paymentFallback() {
        return ResponseEntity.ok("Payment Service is currently unavailable. Please try again later.");
    }
	

	

}
