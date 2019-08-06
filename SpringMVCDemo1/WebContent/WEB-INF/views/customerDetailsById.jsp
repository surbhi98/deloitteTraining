<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="searchId.do" method="get">
<label>Customer id:</label>
<f:input path = "customerId" type="text" name = "customerId" ></f:input>
<br>
<input type="submit" value="Search">
<input type ="reset" value="clear"><br>
Customer Name:
<f:input path = "customerName" type="text" name = "customerName" id="customerName"></f:input>
<br>
Customer address:
<f:input path = "customerAddress" type="text" name = "customerAddress" id="customerAddress"></f:input>
<br>
Bill amount
<f:input path = "billAmount" type="text" name = "billAmount" id="billAmount" ></f:input>
<br>

</f:form>
</body>
</html>