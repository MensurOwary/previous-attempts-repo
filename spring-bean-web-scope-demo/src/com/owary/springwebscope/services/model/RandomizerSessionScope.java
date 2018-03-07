package com.owary.springwebscope.services.model;

import java.util.Random;

public class RandomizerSessionScope {
	private int randomNumber = 100;
	
	public int getRandomNumber(){return randomNumber;}
	public void newRandomNumber(){this.randomNumber = new Random().nextInt(10000);}
}
