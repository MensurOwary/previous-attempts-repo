package com.owary.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.owary.spring.model.WelcomeModel;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String doWelcome(Model model){
		// 1. Retrieve the data
		String result = new WelcomeModel().sayHello("Faora");
		
		// 2. Add data to the model
		model.addAttribute("greeting", result);
		
		// 3. Return the result;
		return "welcome";
	}
	
	
	
	
}
