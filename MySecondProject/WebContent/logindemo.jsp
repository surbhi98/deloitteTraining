<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="validate.jsp">
username <input type="text " name="uname">
pasword <input type="password" name = "pwd">
<input type ="submit" value="Login">
</form>

<%
String errm = (String)session.getAttribute("errMsg");
if(errm == null) errm = "";
 

%>
<br>
<font color = "red">
<%= errm %>
<% session.invalidate(); %>
</font>












<% %>
</body>
</html>