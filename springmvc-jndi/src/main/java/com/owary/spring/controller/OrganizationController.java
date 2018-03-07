package com.owary.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.owary.spring.domain.Organization;
import com.owary.spring.services.OrganizationService;

@Controller
public class OrganizationController {
	
	@Autowired
	private OrganizationService organizationService;
	
	@RequestMapping
	public String listOrganizationUsingSQLTag(){
		return "listOrganization1";
	}
		
	@RequestMapping("/service")
	public String listOrganizationUsingService(Model model){
		List<Organization> list = organizationService.getList();
		model.addAttribute("orgs", list);
		return "listOrganization2";
	}
	
}
