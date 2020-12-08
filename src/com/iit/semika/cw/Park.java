package com.iit.semika.cw;

import java.time.LocalTime;

public class Park extends Attraction {
	
	private ParkType type;

	//No 'priceOfAdmittence' attribute as an argument
	public Park(String name, String location, LocalTime openTime, 
			LocalTime closeTime, String telephoneNumber, ParkType type) {
		
		super(name, location, openTime, closeTime, telephoneNumber);
		this.type = type;
		
	}

	public ParkType getType() {
		return type;
	}

	public void setType(ParkType type) {
		this.type = type;
	}
	
}
