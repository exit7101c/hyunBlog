package com.hyun.apiblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import select.exquery.service.ExqueryService;

import java.util.HashMap;

@RestController
public class TestConrtoller {

	private final ExqueryService exqueryService;

	public TestConrtoller(ExqueryService exqueryService) {
		this.exqueryService = exqueryService;
	}

	@GetMapping("/test")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(value = "/testtest", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public HashMap<String, Object> testCheck(@RequestParam HashMap<String, Object> param) throws Exception {
		System.out.println(param);
		return exqueryService.selectOne("hyun.apiblog.test.testCheck", param);
	}

}
