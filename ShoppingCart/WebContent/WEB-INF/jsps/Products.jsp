<%@page import="com.shopping.main.Model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Products</h1>
	<%
		//String Name = (String) request.getAttribute("pname");
		//int Price = (int) request.getAttribute("price");
		//out.println(Name);
		//out.println(Price);
	%>
	<%
		List<Product> list = (List) request.getAttribute("list");
		for (Product p : list) {
			out.print(p + "<BR>");
		}
	%>
	<h3>Enter Product to be Added</h3>
	<fieldset style="width: 30%">
		<legend>Product </legend>
		<form action="${pageContext.request.contextPath }/Add-Product"
			Method="post">
			<label>Id</label><input type="number" name="pId"><br /> 
			<label>Title:</label><input type="text" name="pTitle"><br /> 
			<label>Price:</label><input type="number" name="pPrice"><br /> 
			<label>Rating:</label><input type="number" name="pRating"><br />
			<input type="submit" value="Add-Product">
		</form>
	</fieldset>
</body>
</html>