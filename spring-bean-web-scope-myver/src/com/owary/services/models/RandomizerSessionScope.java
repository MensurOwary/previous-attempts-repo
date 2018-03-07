package com.owary.services.models;

import java.util.Random;

public class RandomizerSessionScope {
	int randomNum = 15;
	
	public int getRandom() {return randomNum;}
	public void generate() {this.randomNum = new Random().nextInt(1000);}
	
}
