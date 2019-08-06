//Demo for singleton pattern

package com.delloite.customer;

public class Payment {
	
	static Payment payment = new Payment();
	private Payment()
	{	System.out.println("object of payment created");
	
		
	}
	
	public static Payment getPaymentObj()
	{	return payment;
		
	}
	
	public void pay(int amt)
	{
		System.out.println("Payment done: "+ amt);
	}
	
	
	
}
