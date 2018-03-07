package com.owary.faora.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.owary.faora.domain.Dream;
import com.owary.faora.services.DreamService;
import com.owary.faora.services.DreamServiceImpl;
import com.owary.faora.validators.DreamValidator;

@Controller
@RequestMapping("/dream")
public class DreamsController {

	@Autowired
	private DreamServiceImpl ds;

//	 @Autowired
//	 private DreamValidator dv;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new DreamValidator());
		// binder.setValidator(dv);
	}

	@RequestMapping("/{id}")
	public String displayDream(@PathVariable Integer id, Model model) {
		Dream d = ds.getDreamById(id);
		model.addAttribute("page", "dream/dream_content.jsp");
		model.addAttribute("title", d.getTitle());
		model.addAttribute("dream", ds.getDreamById(id));
		return "index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String wishADream(Model model) {
		model.addAttribute("page", "interactions/add.jsp");
		model.addAttribute("title", "Wish a Dream!");
		if (!model.containsAttribute("dream")) {
			model.addAttribute("dream", new Dream());
		}
		return "index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String flyADream(@Validated @ModelAttribute Dream dream, final BindingResult errors, RedirectAttributes attr,
			Model model) {
		if (errors.hasErrors()) {
			attr.addFlashAttribute("org.springframework.validation.BindingResult.dream", errors);
			attr.addFlashAttribute("dream", dream);
			return "redirect:/dream/add/";
		} else {
			model.addAttribute("page", "dream/dream_content.jsp");
			model.addAttribute("title", dream.getTitle());
			model.addAttribute("dream", dream);
			ds.insertDream(dream);
			return "index";
		}
	}

//	@RequestMapping("/random")
//	public String displayDreamRandomly(Model model) {
//		model.addAttribute("page", "dream/dream_content.jsp");
//		model.addAttribute("title", "Random Dream Homepage");
//		model.addAttribute("dream", ds.getRandomDream());
//		return "index";
//	}

}
