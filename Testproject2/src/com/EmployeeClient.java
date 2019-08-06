package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeClient {
	
	public static int count;
	public EmployeeClient()
	{
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fnm, lnm;
		String eid;
		int ch=0;
		EmployeeDAO  employeeDAO = new EmployeeDAOImpl();
		
		do {
		System.out.println("Storing employee object in  database");
		
			
		
		
		
		Employee e = new Employee();
		Scanner s = new Scanner(System.in);
	//	System.out.println("Enter Employee id: ");
		//e.setEmpId(s.next());
		System.out.println("Enter employee first name: ");
		{ 	fnm = s.next();
			e.setEmpFname(fnm);
		}
		System.out.println("Enter employee last name: ");
		{ lnm = s.next();
			e.setEmpLname(lnm);
		}
		System.out.println("Enter employee address: ");
		e.setEmpAddress(s.next());
		System.out.println("Enter date of birth: ");
		e.setDob(s.next());
		
		String sf= fnm.substring(0, 2);
		String lf =lnm.substring(0,2);
		++count;
		String sn = String.format("%03d", count);
		eid = sf+lf+sn;
		e.setEmpId(eid);
		
		
		
		boolean res = employeeDAO.insertEmp(e);
		if(res)
			System.out.println("Employee successfully stord in database");
		else System.out.println("Error!! Not stored");
		
		System.out.println("Enter 1 to contiue storing more employees!!");
		ch = s.nextInt();
		}while(ch == 1);
		

	

}
}