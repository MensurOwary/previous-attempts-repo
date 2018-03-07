package com.owary.faora.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.owary.faora.services.DreamServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private DreamServiceImpl ds;

	@RequestMapping("/")
	public String bounce(Model model) {
		model.addAttribute("page", "home/home_content.jsp");
		model.addAttribute("title", "Dream Homepage");
		model.addAttribute("dreams", ds.divideIntoFour(ds.getAllDreams()));
		return "index";
	}

	@RequestMapping(value = "/file", method = RequestMethod.GET)
	public String show() {
		return "fileUpload";
	}

	@RequestMapping(value = "/file", method = RequestMethod.POST)
	public String upload(@RequestParam("file") CommonsMultipartFile file, HttpSession session, Model model) {

		ServletContext context = session.getServletContext();
		String path = context.getRealPath("/resources/uploads/");
		String filename = file.getOriginalFilename();

		System.out.println(path + " " + filename);
		
		try {
			byte[] bytes = file.getBytes();
			File myFile = new File(path + File.separator + filename);
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(myFile));
			stream.write(bytes);
			stream.flush();
			stream.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		String res = path + "" + filename;

		String mapp = "/resources/uploads/"+filename;
		
		model.addAttribute("title", "ImageUrl");
		model.addAttribute("link", mapp);
		
		return "fileUploadView";
	}

}
