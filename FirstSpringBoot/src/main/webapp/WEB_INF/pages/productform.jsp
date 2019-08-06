<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri = "http://www.springframework.org/tags/form" prefix ="form" %>
 <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c" %> %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align ="center">Product form</h2>
<c:url var="addAction" value="/addProduct" ></c:url>

<form:form action = "${addAction}" modelAttribute="product">
Product id: <form:input path = "productId" name = "productId"/><br>
Product Name: <form:input path = "productName" name = "productName"/><br>
Product Quantity: <form:input path = "quantity" name="quantity"/><br>
Product Price: <form:input path = "price" name = "price"/><br>

<c:if test="${!empty product.productName}">
				<input type="submit" 
				formaction="/updateProduct"
					value="Update" />
			</c:if>
<c:if test="${empty product.productName}">
	<input type="submit" value="Add Product" />
</c:if>



</form:form>

<h3>Persons List</h3> 
<c:if test="${!empty listProducts}">
	
	
	
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="120">Product Price</th>
		<th width="120">Product Quantity</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listProducts}" var="p">
	
		<tr>
			<td>${p.productId}</td>
			<td>${p.productName}</td>
			<td>${p.price}</td>
			<td>${p.quantity}</td>
		<td><a href="<c:url value='/edit/${p.productId}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${p.productId}' />" >Delete</a></td>

		</tr>
	</c:forEach>
	</table>
</c:if>

</body>
</html>