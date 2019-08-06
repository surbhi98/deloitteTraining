package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.DbUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean insertEmp(Employee emp) {
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
		PreparedStatement statement = connection.prepareStatement("insert into hr.employee values(?,?,?,?,?)");
		statement.setString(1,  emp.getEmpFname());
		statement.setString(2, emp.getEmpLname());
		statement.setString(3, emp.getEmpId());
		statement.setString(4, emp.getDob());
		statement.setString(5, emp.getEmpAddress());
		//Statement statement = connection.createStatement();
		nor = statement.executeUpdate();
		//int noofRec = statement.executeUpdate("Insert into HR.customer values("+id+", '"+name+"','"+ addr + "',"+ bill+")");
		//System.out.println("Rows affected: "+ noofRec);
		}
		catch(SQLException e) { e.printStackTrace();}
		
		if(nor==0) return false;
		else return true;
		
		
		
		
		
	}

	

}
