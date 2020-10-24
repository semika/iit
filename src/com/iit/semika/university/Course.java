package com.iit.semika.university;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private Long id;
	private String courseName;
	private Lecturer courseLeader;
	
	private List<Student> studenList;
	
	private List<Module> moduleList;

	public Course(Long id, String courseName, Lecturer courseLeader) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseLeader = courseLeader;
		this.moduleList = new ArrayList<Module>();
		this.studenList = new ArrayList<Student>(); 
	}
	
	public void addModule(Module module) {
		this.moduleList.add(module);
	}
	
	public void registerStudent(Student student) {
		this.studenList.add(student); 
	}

}
