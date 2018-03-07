package com.owary.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;



@Configuration							  // Indicates that this class is configuration class	
@ComponentScan("com.owary.spring") 		  // Replaces context:component-scan tag in servlet xml
@EnableWebMvc							  // Replaces mvc:annotation-driven tag in servlet xml	
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	/*
	 * This method replaces viewResolver bean in servlet.xml. Here we set suffix, prefix and corresponding view 
	 * technology class such as ThymeLeaf, JSP, Velocity
	 */
	@Bean
	public UrlBasedViewResolver urlBasedViewResolver(){
		UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
		urlBasedViewResolver.setPrefix("/WEB-INF/views/");
		urlBasedViewResolver.setSuffix(".jsp");
		urlBasedViewResolver.setViewClass(JstlView.class);
		return urlBasedViewResolver;
	}
}
