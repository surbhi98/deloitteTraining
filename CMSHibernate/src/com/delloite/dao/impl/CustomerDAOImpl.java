package com.delloite.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.models.Customer;
import com.delloite.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {
	
	Configuration configuration = new Configuration().configure();
	SessionFactory factory =configuration.buildSessionFactory();
	Session session;
	 
	
	
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		session = factory.openSession();
		
		
		
		/*List<Customer>customerList =new ArrayList<Customer>();
		List query = session.createQuery("from Customer").list();
		return query;
		*/
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.ilike("customerAddress", "pune"));
		return criteria.list();
		
		
		
		/*	
		*List<Customer>customerList =new ArrayList<Customer>();
		Query query = session.createQuery("from Customer"); 
		 Iterator<Customer>it = query.iterate();
		while(it.hasNext())
		{	customerList.add(it.next());
			
		}
		*/
		
		//return customerList;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	//	Customer customer = new Customer(1, "Priti","Pune",4234);
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
		return true;
		
		
		
		
	}
	
	private static final String UPDATE_Q = "update hr.customer set CUSTOMERNAME=?, CUSTOMERADDRESS=?, BILAMOUNT=? where customerId = ? ";
	
	@Override
	public boolean updateCustomer( Customer customer) {
		// TODO Auto-generated method stub
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		session.close();
		factory.close();
		
		return true;
		
		
		
		
		
		//return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = (Customer)session.get(Customer.class, customerId);
		return customer;
		
		
	
	}

	private static final String SELECT_Q = "select * from hr.customer where customerId=?";
	@Override
	
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		
		return true;
	}

}
