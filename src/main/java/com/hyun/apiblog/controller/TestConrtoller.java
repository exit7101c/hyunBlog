package com.hyun.apiblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class TestConrtoller {

	@GetMapping("/test")
	public String hello() {
		return "Hello World";
	}

}
