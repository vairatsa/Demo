package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller2")
public class Controller2 {
	
	@GetMapping("/get")
	public String getResponse() {
		String str = "Service2";
		return str;
	}

}
