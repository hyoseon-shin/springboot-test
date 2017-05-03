package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/getTest", method = RequestMethod.GET)
	public String getTest() {
		return "getTest!!";
	}

	@RequestMapping(value = "/postTest", method = RequestMethod.POST)
	public String postTest() {
		return "postTest!!";
	}

}
