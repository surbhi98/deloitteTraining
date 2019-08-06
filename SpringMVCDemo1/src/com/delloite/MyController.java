package com.delloite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.models.Customer;
import com.delloite.cms.service.CustomerService;
import com.delloite.dao.impl.CustomerDAOImpl;
import com.delloite.service.impl.CustomerServiceImpl;

@Controller
public class MyController {
	
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/apple")
	public String gg()
		{	return "ball";
		}
		
	@RequestMapping("/add")
	public ModelAndView addCust(Customer customer)
	{	
	/*	ModelAndView view = new ModelAndView();
		view.setViewName("add");
		view.addObject("message", "hello this is messge to add customer");
		view.addObject("msg", "hello I am message");
		return view;
		*/
	//	CustomerService customerService = (CustomerService) new CustomerServiceImpl();
		customerService.insertCustomer(customer);
		System.out.println("This is modelview");
		return new ModelAndView("success", "a", customer);
	}
	
	@RequestMapping("/update")
	public String updateCust()
	{	
		
		
		return "update";
		
	}
	
	@RequestMapping("/delete")
	public String deleteCust()
	{	return "delete";
		
	}
	
	@RequestMapping("/searchIdform")
	public ModelAndView findCustIdform()
	{	
		return new ModelAndView("customerDetailsById", "command", new Customer());
		 
	}
	
	@RequestMapping("/searchId")
	public ModelAndView findCustId(Customer customer)
	{	Customer cust = new Customer();
		cust = customerService.searchCustomerById(customer.getCustomerId());
		return new ModelAndView("customerDetailsById", "command", cust);
		 
	}
	
	
	@RequestMapping("/find")
	public String findCust()
	{	return "findcust";
		
	}
	
	
}
