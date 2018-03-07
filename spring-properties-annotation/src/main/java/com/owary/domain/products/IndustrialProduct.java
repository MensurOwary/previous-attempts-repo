package com.owary.domain.products;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class IndustrialProduct extends GenericProduct {

	@Override
	public int calculatePrice() {
		return new Random().nextInt(priceRandomizer);
	}

}
