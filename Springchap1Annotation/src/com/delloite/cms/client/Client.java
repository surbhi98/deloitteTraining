package com.delloite.cms.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.delloite.cms.config.AppConfiguration;
import com.delloite.cms.models.Address;
import com.delloite.cms.models.Customer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
	
		
		Customer customer = context.getBean(Customer.class);
		Address address = context.getBean(Address.class);
		
		customer.setCustomerId(3);
		customer.setCustomerName("Radha");
		customer.setCustomerAddress("pune");
		customer.setBillAmount(3534);
		
		address.setaId(3343);
		address.setCity("mumbai");
		address.setState("maharashtra");
		
	//	customer.setAddress(address);
		System.out.println(customer.getAddress());
		context.registerShutdownHook();

	}

}
