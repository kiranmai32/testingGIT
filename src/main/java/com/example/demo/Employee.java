package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private String empName;
	@Autowired
	private Technologies technology;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Technologies getTechnology() {
		return technology;
	}
	public void setTechnology(Technologies technology) {
		this.technology = technology;
	}
	
	public void display() {
		System.out.println("object is created");
		technology.techn();
	}

}
