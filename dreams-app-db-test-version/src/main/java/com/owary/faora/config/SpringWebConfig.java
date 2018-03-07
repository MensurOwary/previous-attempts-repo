package com.owary.faora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan(
		{ "com.owary.faora.controllers", "com.owary.faora.services", "com.owary.faora.domain",
		"com.owary.faora.validator", "com.owary.faora.dao"}
		)
public class SpringWebConfig extends WebMvcConfigurerAdapter {
	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//	}

//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setViewClass(JstlView.class);
//		viewResolver.setPrefix("/WEB-INF/views/");
//		viewResolver.setSuffix(".jsp");
//		return viewResolver;
//	}

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
		rb.setBasenames(new String[] { "validation" });
		return rb;
	}

}
