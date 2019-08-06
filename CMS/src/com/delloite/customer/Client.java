package com.delloite.customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		//Load driver
		//CustomerJDBCop c = new CustomerJDBCop();
		
		
		int ch;
		do {
			System.out.println("Enter your choice \n1.Print customer records\n2. Insert\n 3. Delete");
			Scanner s = new Scanner(System.in);
			int opt = s.nextInt();
			switch(opt)
			{	case 1: CustomerJDBCop.printRecord(); break;
				case 2: 
					System.out.println("Enter cusomerid: ");
					int cusid = s.nextInt();
					System.out.println("Enter customer name: ");
					String cusname = s.next();
					System.out.println("Enter customer address: ");
					String cusaddr = s.next();
					System.out.println("Enter bill amount: ");
					int cusbill = s.nextInt();
					
					CustomerJDBCop.insertRecord(cusid, cusname, cusaddr, cusbill); break;
				case 3: CustomerJDBCop.deleteRecord(); break;
		
			}
			
			System.out.println("Want to continue?(0/1): ");
			ch = s.nextInt();
			}while(ch==1);
		
	
	}
	
}
