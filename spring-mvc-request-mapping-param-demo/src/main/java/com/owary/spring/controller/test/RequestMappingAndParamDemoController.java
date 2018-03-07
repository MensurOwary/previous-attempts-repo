package com.owary.spring.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/requestMappingParamDemo")
public class RequestMappingAndParamDemoController {

	public static Logger LOGGER = LoggerFactory.getLogger(RequestMappingAndParamDemoController.class);
	
	@RequestMapping(value="/home")
	public String home(){
		return "requestMappingAndParamHome";
	}

//	Test1 : @RequestParam without any kind of expicit attributes
	@RequestMapping(value="/test1")
	public String requestMappingAndParamTestOne(@RequestParam(value="orgName") String orgName, Model model){
		model.addAttribute("orgname", orgName);
		model.addAttribute("testSerial", "test1");
		return "requestMappingAndParamResults";
	}
	
//	Test2 : @RequestParam with method attribute
	@RequestMapping(value="/test2", method = RequestMethod.GET) // Restricts the request method only to the GET Requests
//	@RequestMapping(value="/test2", method = RequestMethod.GET,RequestMethod.POST) -> How to add multiple attributes
	public String requestMappingAndParamTestTwo(@RequestParam(value="orgName") String orgName, Model model){
		model.addAttribute("orgname", orgName);
		model.addAttribute("testSerial", "test2");
		return "requestMappingAndParamResults";
	}
	
//	Test3 : @RequestParam fallback feature
	@RequestMapping(value="*")
	public String requestMappingAndParamTestThree(){
		return "404";
	}
	
//	Test4 : @RequestParam with defaultValue attribute
	/*
	 * What defaultValue does is it basically prevents the app from throwing 404 Error when the value hasn't been set
	 */
	@RequestMapping(value="/test4")
	public String requestMappingAndParamTestFour(@RequestParam(value="orgName", defaultValue="Batman Loves Faora") String orgName, Model model){
		model.addAttribute("orgname", orgName);
		model.addAttribute("testSerial", "test4");
		return "requestMappingAndParamResults";
	}
	
//	Test5 : @RequestParam without a specific name attribute
	/*
	 * When we use this method, it should be remembered that the parameter names correspond to the names of the form fields
	 */
	@RequestMapping(value="/test5")
	public String requestMappingAndParamTestFive(@RequestParam String orgName, Model model){
		model.addAttribute("orgname", orgName);
		model.addAttribute("testSerial", "test5");
		return "requestMappingAndParamResults";
	}
	
//	Test6
	/*
	 * This and in the subsequent method we are accepting the request from the same URL pattern
	 * However, distinguish them using params parameter
	 */
	@RequestMapping(value="/test6", params="orgName")
	public String requestMappingAndParamTestSixSubOne(@RequestParam String orgName, Model model){
		model.addAttribute("orgname", orgName);
		model.addAttribute("testSerial", "test6 - Sub 1");
		return "requestMappingAndParamResults2";
	}
//	Test6
	/*
	 * This and in the previous method we are accepting the request from the same URL pattern
	 * However, distinguish them using params parameter
	 */
	@RequestMapping(value="/test6", params="empCount")
	public String requestMappingAndParamTestSixSubTwo(@RequestParam String empCount, Model model){
		model.addAttribute("empCount", empCount);
		model.addAttribute("testSerial", "test6 - Sub 2");
		return "requestMappingAndParamResults2";
	}
	
}
