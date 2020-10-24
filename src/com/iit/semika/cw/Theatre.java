package com.iit.semika.cw;

import java.time.LocalTime;

public class Theatre extends Attraction {

	private Integer capacity;
	
	
	public Theatre(String name, String location, Double price, LocalTime openTime, LocalTime closeTime, Integer capacity) {
		super(name, location, price, openTime, closeTime); 
		this.capacity = capacity;
	}

	//setters and getters
	
}
