package com.iit.semika.cw;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Attraction> attractionList = getAttraction(); 
		
		for (Attraction attraction : attractionList) {
			
		}
	}
	
	private static List<Attraction> getAttraction() {
		
		List<Attraction> attractionList = new ArrayList<Attraction>(); 

		//Create Park object. No 'price' for Park
		
		Attraction park = new Park("New Forest National Park", "Norwich NR1 1RY", LocalTime.parse("08:00"), LocalTime.parse("17:00")); 
		attractionList.add(park);
		
		//Create charged museum.
		
		Attraction charedMuseum = new Museum("Charged Musseum", "Norwich NR10 12RY", 6.5, LocalTime.parse("08:00"), LocalTime.parse("17:00")); 
		attractionList.add(charedMuseum);
		
		//Create free museum
		Attraction freeMuseum = new Museum("Free Museum", "Norwich NR35 09RY", LocalTime.parse("08:00"), LocalTime.parse("17:00")); 
		attractionList.add(freeMuseum);
		
		//Create theatre
		Attraction theatre = new Theatre("Savory", "Wellawattha", 120.0, LocalTime.parse("19:00"), LocalTime.parse("21:00"), 500); 
		attractionList.add(theatre); 
		
		return attractionList;
	}

}
