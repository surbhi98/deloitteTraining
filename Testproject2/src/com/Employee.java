package com;

import java.io.Serializable;

public class Employee implements Serializable{
	
	
	
	private String empId;
	private String empFname;
	private String empLname;
	private String empAddress;
	private String dob;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpFname() {
		return empFname;
	}
	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}
	public String getEmpLname() {
		return empLname;
	}
	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Employee() {}
	
	
	public Employee(String empId, String empFname, String empLname, String empAddress, String dob) {
		super();
		this.empId = empId;
		this.empFname = empFname;
		this.empLname = empLname;
		this.empAddress = empAddress;
		this.dob = dob;
	}
	

}
