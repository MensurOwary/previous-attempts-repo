package com.owary.domain;

import com.owary.interfaces.BusinessServices;

public class Organization {
	
	private String name;
	private int foundation;
	private int employeeCount;
	private String postalCode;
	private String slogan;
	private BusinessServices businessServices;
	
//	public Organization(){
//		
//	}
	
	public void destroy(){
		System.out.println("Destroy");
	}
	
	public void init(){
		System.out.println("Build");
	}
	
	public Organization(String name, int foundation){
		this.name = name;
		this.foundation = foundation;		
	}
	
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessServices(BusinessServices businessServices) {
		this.businessServices = businessServices;
	}

	public String motto(){
		return slogan;
	}
	
	public String corporateService(){
		return businessServices.offerServices(name);
	}

	@Override
	public String toString() {
		return "Organization [name=" + name + ", foundation=" + foundation + ", employeeCount=" + employeeCount
				+ ", postalCode=" + postalCode + "]";
	}
	
	
	
	
}
