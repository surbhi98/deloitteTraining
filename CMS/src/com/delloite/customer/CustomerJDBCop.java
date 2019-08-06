package com.delloite.customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class CustomerJDBCop {
	
	public static void insertRecord(int id, String name, String addr, int bill) throws ClassNotFoundException, SQLException, IOException
	{	
		
		Connection connection = DbUtility.getMyConnection();
		PreparedStatement statement = connection.prepareStatement("insert into hr.customer values(?,?,?,?)");
		statement.setInt(1,  id);
		statement.setString(2, name);
		statement.setString(3, addr);
		statement.setInt(4, bill);
		//Statement statement = connection.createStatement();
		int noofRec = statement.executeUpdate();
		//int noofRec = statement.executeUpdate("Insert into HR.customer values("+id+", '"+name+"','"+ addr + "',"+ bill+")");
		System.out.println("Rows affected: "+ noofRec);
		
		
		
		
	}
	public static void printRecord() throws ClassNotFoundException, SQLException, IOException
	{	
		Connection connection = DbUtility.getMyConnection();
		Statement statement = connection.createStatement();
		
		ResultSet res = statement.executeQuery("select * from HR.customer");
		while(res.next())
		{	System.out.println(res.getString(1)+" "+ res.getString(2)+ " "+res.getString(3)+" "+ res.getString(4));
			
		}
		
		
		
	}
	public static void deleteRecord() throws ClassNotFoundException, SQLException, IOException
	{	
		
		System.out.println("Enter customer id to be deleted: ");
		Scanner sr = new Scanner(System.in);
		int idd =  sr.nextInt();
		Connection connection = DbUtility.getMyConnection();
		PreparedStatement statement = connection.prepareStatement("delete from hr.customer where customerId =?");
		statement.setInt(1,  idd);
		
		int noofrecd = statement.executeUpdate();
		System.out.println("Rows deleted: "+noofrecd);
		
		
		
		
	}

	

}
