package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.models.Customer;
import com.delloite.dao.impl.CustomerDAOImpl;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter=0;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		++counter;
		response.setContentType("text/HTML");
	
		int customerId = Integer.parseInt(request.getParameter("custid"));
		String customerName = request.getParameter("custname");
		String customerAddress = request.getParameter("custaddr");
		int billAmount = Integer.parseInt(request.getParameter("custbill"));
		response.getWriter().println("<h1>Hello "+customerName+"! </h1>");
		response.getWriter().println("<h1>Profile<br>Id: "+customerId+"<br>Name: "+customerName+"<br>Address: "+customerAddress+"<br>Bill: "+billAmount +"</h1>");
		
		Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
		CustomerDAO customerDAO = new CustomerDAOImpl();
		boolean res = customerDAO.insertCustomer(customer);
		if(res)
			response.getWriter().println("record saved");
		else response.getWriter().println("not saved");
		
		//Example of servlet chaining
		if(customerName.contentEquals("surbhi"))
		{	RequestDispatcher dispatcher = request.getRequestDispatcher("ValidServlet");
			dispatcher.forward(request,  response);
		}
		
		else {
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("InvalidServlet");
			dispatcher2.forward(request,  response);
			
				
		}
		
		
		
		
		
		
		Cookie[] cookie = request.getCookies();
		boolean visited = false;
		if(cookie!=null) visited = false;
		
		if(visited==false)
		{	response.getWriter().println("you are first time user");
			Cookie c = new Cookie(customerName, customerName);
			response.addCookie(c);
			
		}
		
		else { 
		for(Cookie c: cookie)
		{	response.getWriter().println(c.getName());
			visited=true;
			
		}
		}
		
		
		
		
		}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		resp.getWriter().println("Get");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		super.doPost(req, resp);
		resp.getWriter().println("post");
	}

}
