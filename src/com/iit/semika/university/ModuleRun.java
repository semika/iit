package com.iit.semika.university;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModuleRun {

	private Integer id;
	
	private String acedemicYear;
	
	private Date startDate;
	
	private Date endDate;
	
	private Location location;
	
	private Module module;
	
	private Lecturer moduleLeader;
	
	private List<TimeSlot> moduleRunTimeSlotList;
	private List<Student> studentList;
	
	public ModuleRun(Integer id, String acedemicYear, Date startDate, Date endDate,
			Location location, Module module, Lecturer moduleLeader) {
		super();
		this.id = id;
		this.acedemicYear = acedemicYear;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.module = module;
		this.moduleLeader = moduleLeader; 
		this.moduleRunTimeSlotList = new ArrayList<TimeSlot>(); 
		this.studentList = new ArrayList<Student>(); 
	}

	public void addTimeSlot(TimeSlot timeSlot) {
		this.moduleRunTimeSlotList.add(timeSlot);
	}
	
	public void registerStudent(Student student) {
		this.studentList.add(student);
		student.enrole(this);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcedemicYear() {
		return acedemicYear;
	}

	public void setAcedemicYear(String acedemicYear) {
		this.acedemicYear = acedemicYear;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<TimeSlot> getModuleRunTimeSlotList() {
		return moduleRunTimeSlotList;
	}

	public void setModuleRunTimeSlotList(List<TimeSlot> moduleRunTimeSlotList) {
		this.moduleRunTimeSlotList = moduleRunTimeSlotList;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}
	
}
