package com.owary.implementers;

import java.util.Random;

import com.owary.interfaces.BusinessServices;

public class CloudServices implements BusinessServices{
	
	public String offerServices(String companyName) {
		String services = "\nAs a company - "+companyName+" offers cloud services with annual income which exceeds "+new Random().nextInt(revenue)+" dollars\n";
		return services;
	}

}
