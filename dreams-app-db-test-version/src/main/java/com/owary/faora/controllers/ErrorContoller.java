package com.owary.faora.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class ErrorContoller {

	@RequestMapping(value = "/error")
	public String handleError(HttpServletRequest httpRequest, Model model) {
		Integer errCode = getErrorCode(httpRequest);
		String errorMsg = "";
		
		switch (errCode) {
		case 400: {
			errorMsg = "Http Error Code: 400. Bad Request";
			break;
		}
		case 401: {
			errorMsg = "Http Error Code: 401. Unauthorized";
			break;
		}
		case 404: {
			errorMsg = "Http Error Code: 404. Resource not found";
			break;
		}
		case 500: {
			errorMsg = "Http Error Code: 500. Internal Server Error";
			break;
		}
		}
		model.addAttribute("page", "error/error_404.jsp");
		model.addAttribute("title", errorMsg);
		model.addAttribute("errorMessage", errorMsg);
		return "index";
	}

	private int getErrorCode(HttpServletRequest httpRequest) {
		return (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
	}

}
