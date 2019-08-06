package com.delloite.cms.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.delloite.cms.models.Customer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		C
		ustomer customer = (Customer)factory.getBean("cust");
		System.out.println(customer.getAddress());
		*/
		

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml", "beans2.xml"});
		Customer c1 = (Customer)context.getBean("cust");
		Customer c2 = (Customer)context.getBean("cust");
		System.out.println(c1.getAddress());
		context.registerShutdownHook();
	
	}

}
