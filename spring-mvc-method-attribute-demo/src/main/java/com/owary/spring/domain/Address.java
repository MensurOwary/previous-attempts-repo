package com.owary.spring.domain;

public class Address {
	private String street;
	private String city;
	private String zipCode;
	
	public Address() {
		
	}
	
	public Address(String street, String zipCode) {
		this.street = street;
		this.zipCode = zipCode;
	}
	
	public Address(String street, String zipCode, String city) {
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
}
