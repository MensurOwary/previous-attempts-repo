package com.owary.domain.products;

import java.util.Random;

public class ConsumerProduct extends GenericProduct {

	@Override
	public int calculatePrice() {
		return new Random().nextInt(priceRandomizer);
	}

}
