package com.hyun.apiblog.controller;

import com.hyun.apiblog.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import select.exquery.service.ExqueryService;

import java.util.HashMap;

@RestController
public class TestConrtoller {

	@Autowired
	private ExqueryService exqueryService;

	@GetMapping("/test")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(value = "/testtest", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public HashMap<String, Object> testCheck(@RequestParam HashMap<String, Object> param) throws Exception {
		return exqueryService.selectOne("hyun.apiblog.testtest.testCheck", param);
	}

}
