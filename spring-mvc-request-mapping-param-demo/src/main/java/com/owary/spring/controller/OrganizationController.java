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
	
	@RequestMapping("/location")
	public String addLocation(){
		return "location";
	}
		
	@RequestMapping("/listOrgs")
	public String listOrganizations(Model model){
		List<Organization> list = organizationService.getList();
		String title = "Organization List using Service";
		model.addAttribute("title", title);
		model.addAttribute("orgs", list);
		return "listOrganizations";
	}
	
}
