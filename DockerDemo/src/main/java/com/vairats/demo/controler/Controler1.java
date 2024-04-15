package com.vairats.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller1")
public class Controler1 {
	
	@GetMapping("/get")
	public String getResponse() {
		String str = "Service1";
		return str;
	}

}
