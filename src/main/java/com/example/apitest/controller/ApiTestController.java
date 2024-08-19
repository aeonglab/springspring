package com.example.apitest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiTestController {
	    
	@GetMapping("/api/test")
	public Map<String, Object> testEndpoint(@RequestParam(value = "animal", defaultValue = "Aeong") String animal) {
		Map<String, Object> response = new HashMap<>();
		response.put("message", "Hello, " + animal + "!");
		response.put("timestamp", System.currentTimeMillis());
		return response;
	}
}
