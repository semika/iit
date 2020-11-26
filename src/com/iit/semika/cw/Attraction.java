package com.iit.semika.cw;

import java.time.LocalTime;

public class Attraction {

	private String name;
	private String location;
	private Double price = 0.0; //Default value is zero. 
	private LocalTime openTime;
	private LocalTime closeTime;
	private String telephoneNumber;
	
	public Attraction(String name, String location, Double price, LocalTime openTime, 
			LocalTime closeTime, String telephoneNumber) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.telephoneNumber = telephoneNumber;
	}
	
	public Attraction(String name, String location, LocalTime openTime, 
			LocalTime closeTime,  String telephoneNumber) {
		super();
		this.name = name;
		this.location = location;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.telephoneNumber = telephoneNumber;
	}
	
	public void saveComment(String customerName, String comment) {
		//save comments
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalTime getOpenTime() {
		return openTime;
	}

	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}

	public LocalTime getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(LocalTime closeTime) {
		this.closeTime = closeTime;
	}

	public String getDetails() {
		//send required details
		return "";
	}
}
