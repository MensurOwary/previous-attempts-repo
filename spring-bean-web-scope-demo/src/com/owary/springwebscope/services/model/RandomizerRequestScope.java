package com.owary.springwebscope.services.model;

import java.util.Random;

public class RandomizerRequestScope {
	private int randomNumber = 15;
	
	public int getRandomNumber(){return randomNumber;}
	public void newRandomNumber(){this.randomNumber = new Random().nextInt(10000);}
}
