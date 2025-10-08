package com.springdata.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Data {
	@GetMapping("/get")
	public String getApi() {
		return "Welcome to API";
	}
}