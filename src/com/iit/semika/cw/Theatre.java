package com.iit.semika.cw;

import java.time.LocalTime;

public class Theatre extends Attraction {

	private Integer numberOfSeats;
	
	/**
	 * Since a price for admittance is always applicable for theatre, constructor has the
	 * price attribute. 
	 *
	 */
	public Theatre(String name, String location, Double price, LocalTime openTime, 
			LocalTime closeTime, Integer numberOfSeats, String telephoneNumber) {
		
		super(name, location, price, openTime, closeTime, telephoneNumber); 
		this.numberOfSeats = numberOfSeats;
	}
	
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public void reserveSeat(String visitorName, String seatNumber) {
		//code to reserve a seat.
	}
	
}
