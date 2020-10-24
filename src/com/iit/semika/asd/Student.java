/**
 * 
 */
package com.iit.semika.asd;

import java.util.ArrayList;
import java.util.List;

/**
 * @author semika
 *
 */
public class Student {
	
	private String name;
	
	private List<String> moduleList;
	
	public Student(String name) {
		super();
		this.name = name;
		this.moduleList = new ArrayList<String>();  
	}

	public void addToModule(String moduleCode) {
		this.moduleList.add(moduleCode);
	} 
	
	public void dropModules() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getModuleList() {
		return moduleList;
	}

}
