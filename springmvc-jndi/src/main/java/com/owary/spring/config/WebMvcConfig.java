package com.owary.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
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
}
