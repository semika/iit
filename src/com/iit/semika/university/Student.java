package com.iit.semika.university;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private Long id;
	private Long studentId;
	private String name;

	private Course course;
	
	private List<ModuleRun> moduleRunList;

	public Student(Long studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.moduleRunList = new ArrayList<ModuleRun>(); 
	}
	
	
	
	public void enrole(ModuleRun moduleRun) {
		this.moduleRunList.add(moduleRun);
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getStudentId() {
		return studentId;
	}



	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public List<ModuleRun> getModuleRunList() {
		return moduleRunList;
	}



	public void setModuleRunList(List<ModuleRun> moduleRunList) {
		this.moduleRunList = moduleRunList;
	}
	
}
