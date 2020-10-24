package com.iit.semika.university;

import java.util.ArrayList;
import java.util.List;

public class Module {

	private Integer id;
	private String name;
	private String numberOfCredits;
	private Boolean isCompalsary;
	private Boolean havingCourseWork;
	private Boolean havingExam;
	private ModuleRun moduleRun;
	private Lecturer moduleLeader;
	private List<Course> courseList;
	
	
	
	public Module(String name, String numberOfCredits, Boolean isCompalsary, Boolean havingCourseWork,
			Boolean havingExam, Lecturer moduleLeader) {
		super();
		this.name = name;
		this.numberOfCredits = numberOfCredits;
		this.isCompalsary = isCompalsary;
		this.havingCourseWork = havingCourseWork;
		this.havingExam = havingExam;
		this.moduleLeader = moduleLeader;
		this.courseList = new ArrayList<Course>(); 
	}
	
	
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
	public String getNumberOfCredits() {
		return numberOfCredits;
	}
	public void setNumberOfCredits(String numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	public Boolean getIsCompalsary() {
		return isCompalsary;
	}
	public void setIsCompalsary(Boolean isCompalsary) {
		this.isCompalsary = isCompalsary;
	}
	public Boolean getHavingCourseWork() {
		return havingCourseWork;
	}
	public void setHavingCourseWork(Boolean havingCourseWork) {
		this.havingCourseWork = havingCourseWork;
	}
	public Boolean getHavingExam() {
		return havingExam;
	}
	public void setHavingExam(Boolean havingExam) {
		this.havingExam = havingExam;
	}
	public ModuleRun getModuleRun() {
		return moduleRun;
	}
	public void setModuleRun(ModuleRun moduleRun) {
		this.moduleRun = moduleRun;
	}
	
}
