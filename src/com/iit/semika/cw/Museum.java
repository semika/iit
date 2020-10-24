package com.iit.semika.cw;

import java.time.LocalTime;

public class Museum extends Attraction {

	public Museum(String name, String location, Double price, LocalTime openTime, LocalTime closeTime) {
		super(name, location, price, openTime, closeTime);
	}

	public Museum(String name, String location, LocalTime openTime, LocalTime closeTime) {
		super(name, location, openTime, closeTime);
	}
	
	//getters and setters
}
