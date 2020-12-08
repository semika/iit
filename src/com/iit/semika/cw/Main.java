package com.iit.semika.cw;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Attraction> attractionList = getAttraction(); 
		
		for (Attraction attraction : attractionList) {
			
			if (attraction.getOpenTime().isAfter(LocalTime.parse("19:00"))) {  
				System.out.println(attraction.getName() + " opens after 19:00"); 
			}
			if (attraction.getPriceoOfAdmittence() < 5 && attraction.getPriceoOfAdmittence() > 0) {
				System.out.println(attraction.getName() + " price is less than $5"); 
			}
		}
	}
	
	private static List<Attraction> getAttraction() {
		
		List<Attraction> attractionList = new ArrayList<Attraction>(); 

		//Create Park object. No 'price' for Park
		Attraction park = new Park("New Forest National Park", "Norwich NR1 1RY", 
				LocalTime.parse("08:00"), LocalTime.parse("17:00"), "011254545", ParkType.NATURE);  
		
		attractionList.add(park);
		
		//Create Museum object with 'Price'
		Attraction charedMuseum = new Museum("Charged Musseum", "Norwich NR10 12RY", 4.5, 
				LocalTime.parse("08:00"), LocalTime.parse("17:00"),  "011254545"); 
		attractionList.add(charedMuseum);
		
		//Create Museum object without 'Price'
		Attraction freeMuseum = new Museum("Free Museum", "Norwich NR35 09RY", 
				LocalTime.parse("08:00"), LocalTime.parse("17:00"),  "011254545"); 
		attractionList.add(freeMuseum);
		
		//Create theatre
		Attraction theatre = new Theatre("Savory", "Wellawattha", 120.0, 
				LocalTime.parse("19:30"), LocalTime.parse("21:00"), 500,  "011254545"); 
		attractionList.add(theatre); 
		
		return attractionList;
	}

}
