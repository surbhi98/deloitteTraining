<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int num1, num2, res; %>
<% num1 = Integer.parseInt(request.getParameter("num1"));
	num2 = Integer.parseInt(request.getParameter("num2"));
	res = num1+num2;
	request.setAttribute("res", res);
%>
<jsp:forward page = "result.jsp"></jsp:forward>  <!-- same as request dispatcher -->

</body>
</html>