package com.delloite.cms.service;

import java.util.List;

import com.delloite.cms.models.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public boolean insertCustomer(Customer customer);
	public boolean updateCustomer( Customer customer);
	public boolean deleteCustomer(int customerId);
	public Customer searchCustomerById(int customerId);
	public boolean isCustomerExists(int customerId);
	
	

}
