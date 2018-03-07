package com.owary.spring.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/modelattr")
public class ModelAttributeDemoController {

	public static Logger LOGGER = LoggerFactory.getLogger(ModelAttributeDemoController.class);
	
	/*
	 * ModelAttributed data is available everywhere under the /modelattr section
	 */
	@ModelAttribute
	public void addHeader(Model model){
		model.addAttribute("headerAttribute", "Header");
		model.addAttribute("testData1", "This is TestData1");
		model.addAttribute("testData2", "This is TestData2");
	}
	
	/*
	 * It basically means - model.addAttribute("love", "Sarangheo")
	 */
	@ModelAttribute(name="love")
	public String status(){
		return "Sarangheo";
	}
	
	@RequestMapping(value="/home")
	public String home(){
		return "modelAttr";
	}
	
	@RequestMapping(value="/test1")
	public String requestMappingAndParamTestOne(Model model){
		model.addAttribute("orgname", "FAORA");
		model.addAttribute("testSerial", "test1");
		return "modelAttribute";
	}
}
