package com.owary.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.owary.domain.Organization;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Organization org = (Organization) ctx.getBean("organization");
		
		System.out.println(org);
		
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
