package com.owary.springwebscope.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.owary.springwebscope.services.model.RandomizerRequestScope;
import com.owary.springwebscope.services.model.RandomizerSessionScope;

@Controller
public class WebScopeController {
	
	@Autowired
	RandomizerRequestScope randomizerRequestScope;
	
	@Autowired
	RandomizerSessionScope randomizerSessionScope;
	
	@RequestMapping("/")
	public void getRandom(HttpServletResponse response) throws Exception{
		response.getWriter().write("<h1>Request Scope</h1>");
		response.getWriter().write("Old number : "+randomizerRequestScope.getRandomNumber()+"</br>");
		randomizerRequestScope.newRandomNumber();
		response.getWriter().write("New number : "+randomizerRequestScope.getRandomNumber()+"</br>");
		response.getWriter().write("Object reference : "+randomizerRequestScope+"</br>");
		
		response.getWriter().write("<h1>Session Scope</h1>");
		response.getWriter().write("Old number : "+randomizerSessionScope.getRandomNumber()+"</br>");
		randomizerSessionScope.newRandomNumber();
		response.getWriter().write("New number : "+randomizerSessionScope.getRandomNumber()+"</br>");
		response.getWriter().write("Object reference : "+randomizerSessionScope+"</br>");
		
		
	}
}
