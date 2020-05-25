package com.rakesh.springdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryoptions;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Student() {
		
		//load country options
		countryoptions=new LinkedHashMap<>();
		countryoptions.put("India","India");
		countryoptions.put("USA","USA");
		countryoptions.put("Brazil","Brazil");
		countryoptions.put("Germany","Germany");
	}
	public LinkedHashMap<String, String> getCountryoptions() {
		return countryoptions;
	}
	
	
	
}
