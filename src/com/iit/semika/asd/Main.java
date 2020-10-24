package com.iit.semika.asd;

import java.util.Date;

import com.iit.semika.assembly.Part;
import com.iit.semika.assembly.PartCatalogEntry;

public class Main {

	public static void main(String[] args) {
		//test1();
		test2();
	}
	
	private static void test1() {
		
		PartCatalogEntry ce = new PartCatalogEntry("screw", new Date(), "Japan", 100.0);
		
		Part screw1 = new Part("P00001", ce);  
		
		Part screw2 = new Part("P00002", ce);
		
		System.out.println("Name " + screw1.getName());
		System.out.println("Cost " + screw1.getCost());
		
	}
	
	private static void test2() {
		
		Student s1 = new Student("semika");
		Student s2 = new Student("yumeth");
		
		Module asd = new Module("ASD");
		asd.registerStudent(s1);
		asd.registerStudent(s2); 
		
		Module cca = new Module("CCA");
		cca.registerStudent(s1); 
		
		
		System.out.println("****** Modules followd by " + s1.getName());
		for(String m : s1.getModuleList()) {
			System.out.println(m); 
		}
		
		System.out.println("Student who following ASD");
		
		
		asd.registerStudent(s1); 
		System.out.print("Hi.."); 
		
	}
	
	private static void test3() {
		
		Car car = new Car();
		Driver d = new Driver();
		
		
		car.setDriver(d);
		d.setCar(car); 
		
		
	}

}
