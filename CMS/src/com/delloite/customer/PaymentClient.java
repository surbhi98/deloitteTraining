package com.delloite.customer;

public class PaymentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment pay1 = Payment.getPaymentObj();
		Payment pay2 = Payment.getPaymentObj();
		Payment pay3= Payment.getPaymentObj();
		pay1.pay(45345);
		pay2.pay(3543);
		pay3.pay(45345);
		
	
	
	
	}

}
