package com.delloite.cms.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.delloite.cms.models.Address;

import com.delloite.cms.models.EmployeeDetails;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Customer customer = new Customer(1, "Priti","Pune",4234);
		Configuration configuration = new Configuration().configure();
		SessionFactory factory =configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Set allAddress = new HashSet();
		EmployeeDetails emp1 = new EmployeeDetails(1, "Arun", 34342);
		EmployeeDetails emp2 = new EmployeeDetails(2, "un", 34342);
		EmployeeDetails emp3 = new EmployeeDetails(3, "run", 34342);
		
		
		Address a1 = new Address(1, "Hyd", "telangana");
		Address a2 = new Address(2, "Blr", "Karnataka");
		
		
		allAddress.add(a1);
		allAddress.add(a2);
		emp1.setEmployeeAdres(allAddress);
		emp2.setEmployeeAdres(allAddress);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		
	
		transaction.commit();
		session.close();
		factory.close();
		
		
		
		
		
		

	}

}
