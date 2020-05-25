package com.rakesh.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private String fname;
	@NotNull(message ="is required")
	@Size(min=1,message="is required")
	private String lname;
	
	@Min(value=1,message ="must be greater than or equal to 1")
	@Max(value =10,message ="must be lesser than or equal to 10")
	private int freePasses;
	
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Customer() {
		
	}
	
	

}
