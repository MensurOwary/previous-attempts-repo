package com.owary.faora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.owary.faora.services.DreamService;

@Controller
public class HomeController {
	
	@Autowired
	private DreamService ds;
	
	@RequestMapping("/")
	public String bounce(Model model){
		model.addAttribute("page", "home/home_content.jsp");
		model.addAttribute("title", "Dream Homepage");
		model.addAttribute("dreams", ds.divideIntoFour(ds.getAllDreams()));
		return "index";
	}
	
//	@RequestMapping("*")
//	public String errorPage(Model model){
//		model.addAttribute("page", "error/error_404.jsp");
//		model.addAttribute("title", "404 - Not Found");
//		model.addAttribute("errorMessage", "404 Not Found");
//		return "index";
//	}
	
	


}
