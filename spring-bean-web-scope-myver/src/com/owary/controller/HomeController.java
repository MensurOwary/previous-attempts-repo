package com.owary.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.owary.services.models.RandomizerRequestScope;
import com.owary.services.models.RandomizerSessionScope;

@Controller
public class HomeController {
	
	@Autowired
	RandomizerRequestScope randomizerRequestScope;
	@Autowired
	RandomizerSessionScope randomizerSessionScope;

	@RequestMapping("/")
	public void welcome(HttpServletResponse response) throws Exception{
		response.getWriter().write("<h1>Request Scope</h1>");
		response.getWriter().write("<strong>Old number : </strong>"+randomizerRequestScope.getRandom()+"<br>");
		randomizerRequestScope.generate();
		response.getWriter().write("<strong>New number : </strong>"+randomizerRequestScope.getRandom()+"<br>");
		response.getWriter().write("<strong>Object Reference: <strong><mark>"+randomizerRequestScope+"</mark>");
		
		response.getWriter().write("<h1>Session Scope</h1>");
		response.getWriter().write("<strong>Old number : </strong>"+randomizerSessionScope.getRandom()+"<br>");
		randomizerSessionScope.generate();
		response.getWriter().write("<strong>New number : </strong>"+randomizerSessionScope.getRandom()+"<br>");
		response.getWriter().write("<strong>Object Reference: <strong><mark>"+randomizerSessionScope+"</mark>");
		
	}
	
}
