package com.hyun.apiblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConrtoller {

	@GetMapping("/test")
	public String hello() {
		return "Hello World";
	}
}
