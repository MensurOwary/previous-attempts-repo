package com.owary.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.owary.domain.Organization;
import com.owary.domain.PropertyConfig;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
		Organization org = (Organization) ctx.getBean("organization");
		System.out.println(org);
		System.out.println(org.motto());
		((AnnotationConfigApplicationContext) ctx).close();

	}

}
