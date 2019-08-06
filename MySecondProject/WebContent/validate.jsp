<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname = request.getParameter("uname");
String pwd = request.getParameter("pwd");
if(uname.equals("surbhi")&& pwd.equals("surbhi"))
{ session.setAttribute("uname", uname);%>

<jsp:forward page="success.jsp"></jsp:forward>
<%

}
else{
session.setAttribute("errMsg","Incorrect username or password");
response.sendRedirect("logindemo.jsp");
	
}

%>




</body>
</html>