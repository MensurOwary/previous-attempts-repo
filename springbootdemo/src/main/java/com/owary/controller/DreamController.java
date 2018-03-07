package com.owary.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.owary.domain.Dreams;
import com.owary.repository.DreamRepo;
import com.owary.services.DreamService;

@Controller
public class DreamController {
	
	@Autowired
	private DreamRepo dp;
	
	@Autowired
	private DreamService ds;
	
	@RequestMapping("/home")
	public String home(Model model){
		Dreams dr = new Dreams("Doctor", "I want to be a doctor");
		model.addAttribute("dreams", dp.findAll());
		return "dream/index";
	}
	
	@RequestMapping("/home/{id}")
	public String home(@PathVariable Integer id, Model model){
		List<Dreams> list = new ArrayList<>();
		list.add(dp.findOne(id));
		model.addAttribute("dreams", list);
		return "dream/index";
	}

}
