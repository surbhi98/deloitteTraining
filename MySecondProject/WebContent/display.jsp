<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String username; Date d; %>
<%
username = request.getParameter("usrename");
out.println("Welcome "+ username);
%> 

<% 

%>









</body>
</html>