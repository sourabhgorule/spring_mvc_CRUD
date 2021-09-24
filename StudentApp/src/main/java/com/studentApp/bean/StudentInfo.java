package com.studentApp.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentInfo {

	private int rollnumber;
	private String firstName;
	private String lsatName;
	private String mo_number;
	private String city;

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentInfo(int rollnumber, String firstName, String lsatName, String mo_number, String city) {
		super();
		this.rollnumber = rollnumber;
		this.firstName = firstName;
		this.lsatName = lsatName;
		this.mo_number = mo_number;
		this.city = city;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLsatName() {
		return lsatName;
	}

	public void setLsatName(String lsatName) {
		this.lsatName = lsatName;
	}

	public String getMo_number() {
		return mo_number;
	}

	public void setMo_number(String mo_number) {
		this.mo_number = mo_number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentInfo [rollnumber=" + rollnumber + ", firstName=" + firstName + ", lsatName=" + lsatName
				+ ", mo_number=" + mo_number + ", city=" + city + "]";
	}

}
