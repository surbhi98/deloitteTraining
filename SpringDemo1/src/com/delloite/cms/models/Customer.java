package com.delloite.cms.models;
import java.io.Serializable;

public class Customer implements Serializable {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	private Address address;
	
	public Customer(Address address) {
		super();
		this.address = address;
	}
	
	public void doWork()
	{	System.out.println("this is work function");
		
	}
	
	public void doStop()
	{
		System.out.println("This is stop function");
		
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer()
	{
		System.out.println("default constructor");
	}
	
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
		System.out.println("parametrized cons");
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	
	
}
