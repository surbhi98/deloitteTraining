package com.delloite.cms.models;

import java.util.Set;

public class EmployeeDetails {

	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private Set employeeAdres;
	
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Set getEmployeeAdres() {
		return employeeAdres;
	}

	public void setEmployeeAdres(Set employeeAdres) {
		this.employeeAdres = employeeAdres;
	}

	public EmployeeDetails(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	
	

}
