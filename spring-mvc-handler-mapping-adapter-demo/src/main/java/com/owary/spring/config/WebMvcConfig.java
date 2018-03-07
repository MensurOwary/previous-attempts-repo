package com.owary.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
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
	
	/*
	 * Here we are defining a datasource based on JNDI...
	 * Since the informations required to connect the database is in Tomcat context.xml file and in Resources tag
	 * Then we will utilize those information
	 * 
	 * dataSource method simply returns the DataSource;
	 */
	@Bean
	public DataSource dataSource(){
//		Declaring a new Lookup in order to find the information required to make a connection
		final JndiDataSourceLookup jndiDataSource = new JndiDataSourceLookup();
//		if it was false then we would have to define the full path for JNDI Datasource link...like jdbc:java/comp/env/jdbc/springdb
		jndiDataSource.setResourceRef(true);
//		Retrieving the datasource based on the information
		DataSource dataSource = jndiDataSource.getDataSource("jdbc/springdb");
//		Returning it
		return dataSource;
	}
	
	/*
	 * What this method does is it maps the incoming requests
	 * It defines the ways of how to react it
	 */
	@Bean
	public RequestMappingHandlerMapping requestMappingHandlerMapping(){
		RequestMappingHandlerMapping rmhm = new RequestMappingHandlerMapping();
		/* Whether to use suffix pattern match (".*") when matching patterns to requests. 
		 * If enabled a method mapped to "/users" also matches to "/users.*". 
		*/
		rmhm.setUseSuffixPatternMatch(true);
		/* 
		 * Whether to match to URLs irrespective of the presence of a trailing slash. 
		 * If enabled a URL pattern such as "/users" also matches to "/users/". 
		 */
		rmhm.setUseTrailingSlashMatch(true);
		return rmhm;
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		/*
		 * addViewController - Map a view controller to the given URL path (or pattern) in order to render a response 
		 * 					   with a pre-configured status code and view.
		 * setViewName		 - Set a view name for this ModelAndView, to be resolved by the DispatcherServlet via a ViewResolver. 
		 * 					   Will override any pre-existing view name or View.
		 */
		registry.addViewController("/").setViewName("home");
	}
}
