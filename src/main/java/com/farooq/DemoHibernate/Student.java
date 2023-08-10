package com.farooq.DemoHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

// @Entity(name="student_table") // if i want to create table with specific name

@Entity(name="student_table")
public class Student {
	@Id
	private int id;	
	private StudentName name;
	@Transient
	private String major;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + "]";
	}	
}
