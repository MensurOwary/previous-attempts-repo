package com.owary.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebMvcInitializer implements WebApplicationInitializer {

	
	/*
	 * This method is initialized on the startup of our application
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		/*
		 * Step 1 - Create the context (Container)
		 * Here we use AnnotationConfigWebApplicationContext because we will build this application using pure Java based annotations
		 * There must be only one AnnotationConfigWebApplicationContext container per web application
		 * It is like our ApplicationContext - a.k.a IoC (Inversion of Control) container, matter fact it actually extends that class
		 */
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		/*
		 * Step 2 - Register the WebMvcConfig class
		 * In this step we register our WebMvcConfig class to the container
		 */
		rootContext.register(WebMvcConfig.class);
		
		/* 
		 * Step 3 - Add the Servlet
		 * Adding the servlet 
		 */
		ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(rootContext));
		
		/*
		 * Step 4 - Add Mapping
		 * Adding Mapping which corresponds to the <servlet-mapping> tag and <url-pattern> sub tag
		 */
		registration.addMapping("/");
		
		/*
		 * Step 5 - Set Load on Startup
		 * Setting load on startup...this method will load first...Corresponds to the <servlet> and sub <load-on-startup> tag
		 */
		registration.setLoadOnStartup(1);
	}

}
