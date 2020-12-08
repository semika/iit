package com.iit.semika.cw;

import java.time.LocalTime;

public abstract class Attraction {

	private String name;
	private String location;
	private Double priceOfAdmittence = 0.0; //Default value is zero. 
	private LocalTime openTime;
	private LocalTime closeTime;
	private String telephoneNumber;
	
	//Constructor with price attribute
	public Attraction(String name, String location, Double priceOfAdmittence, LocalTime openTime, 
			LocalTime closeTime, String telephoneNumber) {
		super();
		this.name = name;
		this.location = location;
		this.priceOfAdmittence = priceOfAdmittence;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.telephoneNumber = telephoneNumber;
	}
	
	//Constructor without price attribute.
	public Attraction(String name, String location, LocalTime openTime, 
			LocalTime closeTime,  String telephoneNumber) {
		super();
		this.name = name;
		this.location = location;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.telephoneNumber = telephoneNumber;
	}

	public Double getPriceoOfAdmittence() {
		return priceOfAdmittence;
	}
	public void setPriceOfAdmittence(Double priceofAdmittence) {
		this.priceOfAdmittence = priceofAdmittence;
	}
	public LocalTime getOpenTime() {
		return openTime;
	}
	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		//send required details
		return "";
	}
	public void saveComment(String customerName, String comment) {
		//save comments
	}
	
	//Other getter and settler methods.
}
