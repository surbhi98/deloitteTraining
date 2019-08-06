<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%out.println("hello"); %>
<%= request.getAttribute("cust") %>
<h1>Customer Details</h1>
Customer Id: ${cust.customerId} <br>
Customer Name: ${cust.customerName }<br>
Customer Address: ${cust.customerAddress }<br>
Bill Amount: ${cust.billAmount }<br>
</body>
</html>