package com.owary.faora.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Contact {

	@Column(name="home_number")
	private String homeNumber;

	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="email")
	private String email;

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [homeNumber=" + homeNumber + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	
	
	
	
	
}
