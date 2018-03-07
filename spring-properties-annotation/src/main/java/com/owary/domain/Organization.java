package com.owary.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.owary.interfaces.BusinessServices;

@Component("organization")
public class Organization {
	
//	@Value("${nameOfCompany}")
	private String name;
	
//	@Value("${yearOfIncorporation}")
	private int foundation;
	
	@Value("${postCode}")
	private String postalCode;
	
	@Value("${empCount}")
	private int employeeCount;
	
	@Value("${motto}")
	private String slogan;
	
	private String missionStatement;
	
	@Autowired
	private Environment env;
	
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
	
	
	public Organization(@Value("${nameOfCompany}") String name,@Value("${yearOfIncorporation}") int foundation){
		this.name = name;
		this.foundation = foundation;		
	}
	
	public String motto(){
		missionStatement = env.getProperty("statement");
		return slogan + " and " + missionStatement;
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

	
	
	public String corporateService(){
		return businessServices.offerServices(name);
	}

	@Override
	public String toString() {
		return "Organization [name=" + name + ", foundation=" + foundation + ", employeeCount=" + employeeCount
				+ ", postalCode=" + postalCode + "]";
	}
	
	
	
	
}
