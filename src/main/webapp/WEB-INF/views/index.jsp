<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page Called by Home Controller, url /home</h1>
	<br>
	
	<% String name=(String)request.getAttribute("name"); %>
	
	<h1>name = <%= name %></h1>
</body>
</html>