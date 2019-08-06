package com.delloite.client;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.models.Customer;
import com.delloite.dao.impl.CustomerDAOImpl;

public class CustomerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch=0;
		CustomerDAO customerDAO = new CustomerDAOImpl();
		System.out.println("Customer operation Menu");
		do {
			
		System.out.println("Enter options \n1. Check if customer exists \n 2. Insert customer.\n 3. Update 4. Print all customers.\n 5. Search by customer id \n6. delete customer.");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		switch(op)
		{
			case 1: System.out.println("Enter customer id");
					int cid = sc.nextInt();
					boolean result = customerDAO.isCustomerExists(cid);
					if(result)
						System.out.println("Customer "+cid+"exists");
					else System.out.println("Customer with id"+cid+"doesn't exist");
					break;
				
				
				
				
			case 2:
				Customer c = new Customer(45, "Surbhi", "Ranchi", 34343);
				Scanner s = new Scanner(System.in);
				System.out.println("Enter cusomerid: ");
				c.setCustomerId(s.nextInt());
				System.out.println("Enter customer name: ");
				c.setCustomerName(s.next());
				System.out.println("Enter customer address: ");
				c.setCustomerAddress(s.next());
				System.out.println("Enter bill amount: ");
				c.setBillAmount(s.nextInt());
				boolean res = customerDAO.insertCustomer(c);
				if(res)
					System.out.println("added");
				
				
				break;
			case 3: 

				Customer ct = new Customer();
				
				Scanner st = new Scanner(System.in);
				System.out.println("Enter cusomerid: ");
				ct.setCustomerId(st.nextInt());
				System.out.println("Enter customer name: ");
				ct.setCustomerName(st.next());
				System.out.println("Enter customer address: ");
				ct.setCustomerAddress(st.next());
				System.out.println("Enter bill amount: ");
				ct.setBillAmount(st.nextInt());
				
				
				
				boolean ress = customerDAO.updateCustomer(ct);
				System.out.println(ress);
				break;
			case 4:

				List<Customer>li = new ArrayList<Customer>();
				li=customerDAO.getAllCustomers();
				System.out.println(li);

				
				
				break;
			case 5:
				System.out.println("Enter customer id");
				int ci = sc.nextInt();
				System.out.println(customerDAO.searchCustomerById(ci));
				break;
			case 6:  
				System.out.println("Enter customer id");
				int cii = sc.nextInt();
				System.out.println(customerDAO.deleteCustomer(cii));
				break;
			
		}
		System.out.println("click 1 to continue");
		Scanner sh = new Scanner(System.in);
		ch = sh.nextInt();
		}while(ch==1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
