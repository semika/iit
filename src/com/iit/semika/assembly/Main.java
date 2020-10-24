package com.iit.semika.assembly;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Assembly rootAssembly = new Assembly();
		
		
		PartCatalogEntry entry = getCatalongEntryByFields("screw", new Date(),  "Japan", 100.0);
		
		Component c1 = new Part("P001", entry);
		rootAssembly.addComponent(c1); 
		
		
		Component subAssemby = getSubAssembly();
		
		rootAssembly.addComponent(subAssemby); 
		
		System.out.println(rootAssembly.getCost());
		
	}

	private static Assembly getSubAssembly() {
		//create sub assembly with a 'bolt' and 'screw'
		Assembly subAssemby = new Assembly();
		
		PartCatalogEntry entry = getCatalongEntryByFields("screw", new Date(),  "Japan", 40.0);
		Component c2 = new Part("P002", entry);
		subAssemby.addComponent(c2); 
		
		PartCatalogEntry bolt = new PartCatalogEntry("bolt", new Date(),  "Japan", 50.0);
		Component c3 = new Part("P002", bolt);
		subAssemby.addComponent(c3);
		
		return subAssemby;
	}
	
	
	private static PartCatalogEntry getCatalongEntryByFields(String name, Date date, String country, Double cost) {
		PartCatalogEntry entry = new PartCatalogEntry(name, date,  country, cost);
		return entry;
	}
}
