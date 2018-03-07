package com.owary.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.owary.domain.products.ConsumerProduct;
import com.owary.domain.products.IndustrialProduct;

@Component("tradeFair")
public class TradeFair {
	@Autowired
	private IndustrialProduct industrialProduct;
	@Autowired
	private ConsumerProduct consumerProduct;
	
//	@Autowired
	public TradeFair(IndustrialProduct industrialProduct, ConsumerProduct consumerProduct) {
		this.industrialProduct = industrialProduct;
		this.consumerProduct = consumerProduct;
	}
	
	public int declareIndustrialProduct(IndustrialProduct industrialProduct){
		return industrialProduct.calculatePrice();
	}
	public int declareConsumerProduct(ConsumerProduct consumerProduct){
		return consumerProduct.calculatePrice();
	}
	
	public String specialPromotionalPrice(){
		return "Industrial Product : "+declareIndustrialProduct(industrialProduct)+"\n"+
				"Consumer Product : "+declareConsumerProduct(consumerProduct);
	}
	//@Autowired
	public void setIndustrialProduct(IndustrialProduct industrialProduct) {
		this.industrialProduct = industrialProduct;
	}
	//@Autowired
	public void setConsumerProduct(ConsumerProduct consumerProduct) {
		this.consumerProduct = consumerProduct;
	}
}
