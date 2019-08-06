package com.delloite.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.models.Customer;
import com.delloite.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {
	
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		Connection connection = null;
		
		List<Customer>customerList =new ArrayList<Customer>();
		try {
			connection = DbUtility.getMyConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		Statement statement = connection.createStatement();
		
		ResultSet res = statement.executeQuery("select * from HR.customer");
		
		
		while(res.next())
		{	//l.add(res.getString(1)+" "+ res.getString(2)+ " "+res.getString(3)+" "+ res.getString(4));
			Customer ce = new Customer();
			ce.setCustomerId(res.getInt(1));
			ce.setCustomerName(res.getString(2));
			ce.setCustomerAddress(res.getString(3));
			ce.setBillAmount(res.getInt(4));
			
			customerList.add(ce);
		
		
		}
		}
		catch(SQLException e) {e.printStackTrace();}
		
		return customerList;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		int nor=0;
		Connection connection=null;
		try {
			connection = DbUtility.getMyConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		PreparedStatement statement = connection.prepareStatement("insert into hr.customer values(?,?,?,?)");
		statement.setInt(1,  customer.getCustomerId());
		statement.setString(2, customer.getCustomerName());
		statement.setString(3, customer.getCustomerAddress());
		statement.setInt(4, customer.getBillAmount());
		//Statement statement = connection.createStatement();
		nor = statement.executeUpdate();
		//int noofRec = statement.executeUpdate("Insert into HR.customer values("+id+", '"+name+"','"+ addr + "',"+ bill+")");
		//System.out.println("Rows affected: "+ noofRec);
		}
		catch(SQLException e) { e.printStackTrace();}
		
		if(nor==0) return false;
		else return true;
		
		
		
		
		
		
	}
	
	private static final String UPDATE_Q = "update hr.customer set CUSTOMERNAME=?, CUSTOMERADDRESS=?, BILAMOUNT=? where customerId = ? ";
	
	@Override
	public boolean updateCustomer( Customer customer) {
		// TODO Auto-generated method stub
		int nor=0;
		Connection connection=null;
		try {
			connection = DbUtility.getMyConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		PreparedStatement statement = connection.prepareStatement(UPDATE_Q);
		statement.setString(1,  customer.getCustomerName());
		statement.setString(2, customer.getCustomerAddress());
		statement.setInt(3, customer.getBillAmount());
		statement.setInt(4, customer.getCustomerId());
		//Statement statement = connection.createStatement();
		nor = statement.executeUpdate();
		//int noofRec = statement.executeUpdate("Insert into HR.customer values("+id+", '"+name+"','"+ addr + "',"+ bill+")");
		//System.out.println("Rows affected: "+ noofRec);
		}
		catch(SQLException e) { e.printStackTrace();}
		
		if(nor==0) return false;
		else return true;
		
		
		
		
		
		
		
		//return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		
		
Connection connection = null;
		int rowsd = 0;
//Customer ce = new Customer();
		try {
			connection = DbUtility.getMyConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement statement = connection.prepareStatement("delete from hr.customer where customerId =?");
			statement.setInt(1, customerId);
			
			rowsd = statement.executeUpdate();
		
		}
		catch(SQLException e) {e.printStackTrace();}
		
		if(rowsd==0) return false;
		else return true;
		
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		// TODO Auto-generated method stub
		
Connection connection = null;
		
Customer ce = new Customer();
		try {
			connection = DbUtility.getMyConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		Statement statement = connection.createStatement();
		
		ResultSet res = statement.executeQuery("select * from HR.customer where customerid =" +customerId);
		
		
		if(res.next())
		{	//l.add(res.getString(1)+" "+ res.getString(2)+ " "+res.getString(3)+" "+ res.getString(4));
			
			ce.setCustomerId(res.getInt(1));
			ce.setCustomerName(res.getString(2));
			ce.setCustomerAddress(res.getString(3));
			ce.setBillAmount(res.getInt(4));
			
			
		
		
		}
		}
		catch(SQLException e) {e.printStackTrace();}
		
		return ce;
		
		
		
	
	}

	private static final String SELECT_Q = "select * from hr.customer where customerId=?";
	@Override
	
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		try {
			conn = DbUtility.getMyConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		boolean isUser = false;
		try {
			
			PreparedStatement stm = conn.prepareStatement(SELECT_Q);
			stm.setInt(1, customerId);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) isUser  = true;
			
			
		}
		catch(SQLException e)
		{	e.printStackTrace();
			
		}
		
		
		
		return isUser;
	}

}
