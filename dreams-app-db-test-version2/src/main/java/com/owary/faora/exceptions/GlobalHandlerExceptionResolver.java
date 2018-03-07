package com.owary.faora.exceptions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

//@Component
public class GlobalHandlerExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("page", "error/error_404.jsp");
		mav.addObject("title", "Error Occured");
		mav.addObject("errorMessage", "404 Not Found");
		return mav;
	}

}
