package com.owary.faora.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name="address_line")
	private String addressLine;
	
	@Column(name="city")
	private String city;

	@Column(name="zip_code")
	private String zip;

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", zip=" + zip + "]";
	}
	
	
	
}
