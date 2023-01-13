<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Contact details</h1>
	<%
		int cname = (int) request.getAttribute("ContactPerson");
		out.println(cname);
	%>
</body>
</html>