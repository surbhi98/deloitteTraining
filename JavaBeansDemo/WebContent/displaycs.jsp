<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:forEach begin="1" end="5" step ="1" var="num">
${num}
</s:forEach>
</body>
</html>