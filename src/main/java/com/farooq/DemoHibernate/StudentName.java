package com.farooq.DemoHibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class StudentName {
	@Column(name="first_name")
	private String fname;
	@Column(name="middle_name")
	private String mname;
	@Column(name="last_name")
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "StudentName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
}
