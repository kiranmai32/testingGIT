package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int techId;
	private String techname;
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public String getTechname() {
		return techname;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	
	public  void techn() {
		System.out.println("Spring Boot");
	}

}
