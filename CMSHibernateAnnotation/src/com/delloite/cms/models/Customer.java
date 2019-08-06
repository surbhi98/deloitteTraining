package com.delloite.cms.models;
import java.io.Serializable;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
@Table(name = "NewCustomer")

public class Customer implements Serializable {

	@Id
	@Column(name ="CID")
	
	private int customerId;
	
	@Column(name="custName")
	private String customerName;
	
	@Column(name = "custAddress")
	private String customerAddress;
	
	@Column(name = "billAmount")
	
	private int billAmount;
	
	public Customer()
	{
		
	}
	
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
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
