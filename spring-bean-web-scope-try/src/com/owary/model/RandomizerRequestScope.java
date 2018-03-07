package com.owary.model;

import java.util.Random;

public class RandomizerRequestScope {
	private int randomNum = 150;
	
	public int getRandom(){return randomNum;}
	public void newRandom(){this.randomNum =  new Random().nextInt(1000);}
	
}
