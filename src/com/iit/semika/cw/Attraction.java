package com.iit.semika.cw;

import java.time.LocalTime;

public class Attraction {

	private String name;
	private String location;
	private Double price = 0.0;
	private LocalTime openTime;
	private LocalTime closeTime;
	
	public Attraction(String name, String location, Double price, LocalTime openTime, LocalTime closeTime) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	
	public Attraction(String name, String location, LocalTime openTime, LocalTime closeTime) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	
	//getter and setters
}
