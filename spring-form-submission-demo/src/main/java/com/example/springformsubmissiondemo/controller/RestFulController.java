package com.example.springformsubmissiondemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFulController {

	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
}
