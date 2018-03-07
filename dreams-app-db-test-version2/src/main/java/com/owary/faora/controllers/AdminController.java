package com.owary.faora.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.owary.faora.domain.User;
import com.owary.faora.services.UserServiceImpl;
import com.owary.faora.validators.UserRegisterValidator;

@Controller
@RequestMapping("/__admin00__")
public class AdminController {

	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	private UserRegisterValidator urv;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(urv);
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
	public String registerUser(@ModelAttribute @Validated User user, final BindingResult bindings, RedirectAttributes attr,
			HttpSession session, Model model) {
//		System.out.println(user);
		if (bindings.hasErrors()) {
			System.out.println(bindings);
			attr.addFlashAttribute("org.springframework.validation.BindingResult.user", bindings);
			attr.addFlashAttribute("user", user);
			return "redirect:/__admin00__/register";
		}else{
			CommonsMultipartFile file = user.getFile();
			String file_url = userService.handleImageResizeAndUpload(file, session);
			user.setAvatar(file_url);
			System.out.println(user);
			userService.insertUser(user);
			return "redirect:/";
		}
	}

}
