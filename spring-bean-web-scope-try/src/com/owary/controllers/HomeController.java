package com.owary.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.owary.model.RandomizerRequestScope;
import com.owary.model.RandomizerSessionScope;

@Controller
public class HomeController {
	@Autowired
	RandomizerRequestScope randomizerRequestScope;
	@Autowired
	RandomizerSessionScope randomizerSessionScope;
	
	@RequestMapping("/")
	public void main(HttpServletResponse response) throws Exception{
		response.getWriter().write("<h1>Request Scope</h1>");
		response.getWriter().write("Old Number : "+randomizerRequestScope.getRandom()+"<br>");
		randomizerRequestScope.newRandom();
		response.getWriter().write("New Number : "+randomizerRequestScope.getRandom()+"<br>");
		
		response.getWriter().write("<h1>Session Scope</h1>");
		response.getWriter().write("Old Number : "+randomizerSessionScope.getRandom()+"<br>");
		randomizerSessionScope.newRandom();
		response.getWriter().write("New Number : "+randomizerSessionScope.getRandom()+"<br>");
	}
}
