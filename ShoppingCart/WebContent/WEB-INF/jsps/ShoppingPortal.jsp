<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping portal</title>
</head>
<body>
	<h1>Welcome to Shopping portal</h1>
	<div>
		<a href="${pageContext.request.contextPath}/Cart">CART</a> <br /> <a
			href="${pageContext.request.contextPath}/Contact">CONTACTS</a> <br />
		<a href="${pageContext.request.contextPath}/Products">PRODUCTS</a> <br />
		<a href="${pageContext.request.contextPath}/Categories">CATEGORIES</a>
		<br />
	</div>

</body>
</html>
<!--  
	EL : Expression Language
	SPEL: Spring Expression Language
 -->