package com.iit.semika.asd;

import java.util.Date;

public class Part {
	
	private Long id;
	private String number;
	private Double cost;
	private String name;
	private Date yearOfManufacture;
	private String countryOfManufacture;
	
	private PartCatalogEntry partCatalogEntry;
	
	
	public Part(String number, PartCatalogEntry partCatalogEntry) {
		super();
		this.number = number;
		this.partCatalogEntry = partCatalogEntry;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PartCatalogEntry getPartCatalogEntry() {
		return partCatalogEntry;
	}
	public void setPartCatalogEntry(PartCatalogEntry partCatalogEntry) {
		this.partCatalogEntry = partCatalogEntry;
	}

	public Double getCost() {
		return this.partCatalogEntry.getCost();
	}

	public void setCost(Double cost) {
		this.partCatalogEntry.setCost(cost);
 	}

	public String getName() {
		return this.partCatalogEntry.getName();
	}

	public void setName(String name) {
		this.partCatalogEntry.setName(name);
	}

	public Date getYearOfManufacture() {
		return this.partCatalogEntry.getYearOfManufacture();
	}

	public void setYearOfManufacture(Date yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getCountryOfManufacture() {
		return this.partCatalogEntry.getCountryOfManufacture();
	}

	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}
	
	
}
