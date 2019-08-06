package com.delloite.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.delloite.cms.models.Customer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Customer customer = new Customer(1, "Priti","Pune",4234);
		Configuration configuration = new Configuration().configure();
		SessionFactory factory =configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = (Customer) session.load(Customer.class,1 );
		customer.setCustomerName("John");
		System.out.println(customer);
		
		
	//	session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
		
		
		
		
		

	}

}
