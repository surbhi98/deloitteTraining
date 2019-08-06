package com.delloite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.models.Customer;
import com.delloite.cms.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getAllCustomers();
	}

	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
	if(customer.getCustomerId()>0)
		return customerDAO.insertCustomer(customer);
	else return false;
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.deleteCustomer(customerId);
	}

	public Customer searchCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.searchCustomerById(customerId);
	}

	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExists(customerId);
	}

}
