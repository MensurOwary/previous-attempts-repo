package com.example.springformsubmissiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringFormSubmissionDemoApplication extends SpringBootServletInitializer {
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringFormSubmissionDemoApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringFormSubmissionDemoApplication.class, args);
	}
}
