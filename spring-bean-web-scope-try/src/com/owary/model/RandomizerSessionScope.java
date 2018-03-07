package com.owary.model;

import java.util.Random;

public class RandomizerSessionScope {
	private int randomNum = 15;
	
	public int getRandom(){return randomNum;}
	public void newRandom(){this.randomNum =  new Random().nextInt(1000);}
	
}
