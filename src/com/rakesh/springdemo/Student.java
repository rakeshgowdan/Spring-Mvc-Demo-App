package com.rakesh.springdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryoptions;
	private String language;
	private String[] os;
	
	public String[] getOs() {
		return os;
	}
	public void setOs(String[] os) {
		this.os = os;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
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
