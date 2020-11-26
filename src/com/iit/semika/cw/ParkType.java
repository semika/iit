package com.iit.semika.cw;

public enum ParkType {
	
	NATURE("Nature Park"),
	CITY("City Park"),
	WATER("Water Park");
	
	public final String name; 
	
	private ParkType(String name) {
		this.name = name;
	}

}
