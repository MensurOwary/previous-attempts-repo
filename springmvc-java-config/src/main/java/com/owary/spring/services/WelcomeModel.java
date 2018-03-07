package com.owary.spring.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class WelcomeModel {
	
	public String sayHello(String name){
		String[] arr = {"Salam", "Selam", "Shalom", "Privet", "Hello", "Hola"};
		int x = new Random().nextInt(arr.length);
		String result = arr[x]+", "+name;
		return result;
	}
	
}
