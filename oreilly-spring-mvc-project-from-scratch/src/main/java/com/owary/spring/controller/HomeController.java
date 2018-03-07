package com.owary.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 * The reason that we can use @Controller annotation is that we enabled the <mvc:annotation-driven> tag in the dispatcher-servlet.xml file
 * Also, because of <context:componentScan> tag the Spring Framework is able to find the controllers
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)		// Maps the given url to the corresponding function
	public String showHome(){
		logger.info("at controller");
		return "home";
	}
}
