package com.iit.semika.assembly;

import java.util.Date;

public class PartCatalogEntry {

	private Long id;
	private String name;
	private Date yearOfManufacture;
	private String countryOfManufacture;
	private Double cost;
	
	
	public PartCatalogEntry(String name, Date yearOfManufacture, String countryOfManufacture, Double cost) {
		super();
		this.name = name;
		this.yearOfManufacture = yearOfManufacture;
		this.countryOfManufacture = countryOfManufacture;
		this.cost = cost;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(Date yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getCountryOfManufacture() {
		return countryOfManufacture;
	}
	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}

}
