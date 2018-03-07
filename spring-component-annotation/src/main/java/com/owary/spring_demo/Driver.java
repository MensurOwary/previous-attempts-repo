package com.owary.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.owary.domain.promotion.TradeFair;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		TradeFair tradeFair = (TradeFair) ctx.getBean("tradeFair");
		
		System.out.println(tradeFair.specialPromotionalPrice());
		
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
