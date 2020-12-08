package com.iit.semika.cw;

import java.time.LocalTime;

public class Museum extends Attraction {

	//Constructor with price
	public Museum(String name, String location, Double price, 
			LocalTime openTime, LocalTime closeTime, String telephoneNumber) {
		
		super(name, location, price, openTime, closeTime, telephoneNumber);
	}

	//Constructor without price
	public Museum(String name, String location, LocalTime openTime, 
			LocalTime closeTime, String telephoneNumber) {
		
		super(name, location, openTime, closeTime, telephoneNumber); 
	}
	
	//getters and setters for other attributes and other methods
}
