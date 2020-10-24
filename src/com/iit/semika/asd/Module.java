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
public class Module {
	
	private String moduleCode;
	private List<Student> studentList;
	
	public Module(String moduleCode) {
		super();
		this.moduleCode = moduleCode;
		this.studentList = new ArrayList<Student>(); 
	}


	private void addToStudents(Student student) {
		this.studentList.add(student); 
	}

	
	public void registerStudent(Student student) {
		
		//add the module to module list of Student class
		this.addToStudents(student); //Main task of the method.
		
		student.addToModule(this.moduleCode); 
		
	}
}
