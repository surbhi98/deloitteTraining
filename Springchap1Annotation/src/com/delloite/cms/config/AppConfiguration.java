package com.delloite.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.delloite.cms.models.Address;
import com.delloite.cms.models.Customer;

@Configuration
public class AppConfiguration {

	@Bean
//	@Scope(value="prototype")
	public Customer getCustomerObject()
	{	return new Customer();
		
	}                          
	
	@Bean
	public Address getAddressObject()
	{	return new Address();
		
	}
	
	
	
	public AppConfiguration() {
		// TODO Auto-generated constructor stub
	}

}
