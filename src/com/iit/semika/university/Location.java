package com.iit.semika.university;

public class Location {
	
	private Integer id;
	private String name;
	private Integer numberOfSeats;
	private Boolean isProjectorAvailable;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Boolean getIsProjectorAvailable() {
		return isProjectorAvailable;
	}
	public void setIsProjectorAvailable(Boolean isProjectorAvailable) {
		this.isProjectorAvailable = isProjectorAvailable;
	}

}
