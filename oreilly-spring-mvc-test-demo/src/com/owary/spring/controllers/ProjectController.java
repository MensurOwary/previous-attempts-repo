package com.owary.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.owary.spring.services.ProjectService;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	private ProjectService ps;
	
	@RequestMapping("/add")
	public String addProject(){
		return "project_add";
	}
	
	@RequestMapping("/show")
	@ResponseBody
	public String show(){
		return ps.getPro();
	}
	
	@RequestMapping("/display")
	public String show1(Model model){
		model.addAttribute("ps", ps.getPro());
		return "home";
	}
	
	@RequestMapping("/square/{num}")
	@ResponseBody
	public String square(@PathVariable Integer num){
		String res = "The square of "+num+" is "+(num*num);
		return res;
	}

}
