package com.owary.spring.model;

import java.util.Random;

public class WelcomeModel {
	
	public String sayHello(String name){
		String[] arr = {"Salam", "Selam", "Shalom", "Privet", "Hello", "Hola"};
		int x = new Random().nextInt(arr.length);
		String result = arr[x]+", "+name;
		return result;
	}
	
}
