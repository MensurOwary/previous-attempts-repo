package com.owary.faora.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.owary.faora.domain.User;
import com.owary.faora.validators.UserRegisterValidator;

@Controller
@RequestMapping("/__admin00__")
public class AdminController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new UserRegisterValidator());
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterView(Model model) {
		model.addAttribute("page", "interactions/register.jsp");
		model.addAttribute("title", "Registering Form");
		if (!model.containsAttribute("user")) {
			model.addAttribute("user", new User());
		}
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute @Validated User user, BindingResult bindings, RedirectAttributes attr,
			Model model) {
		System.out.println(bindings);
		if (bindings.hasErrors()) {
			attr.addFlashAttribute("org.springframework.validation.BindingResult.user", bindings);
			attr.addFlashAttribute("user", user);
		}
		return "redirect:/__admin00__/register";
	}

}
