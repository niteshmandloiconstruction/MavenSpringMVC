<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help Page</title>
</head>
<body>
<h4> this is help page</h4>
<%-- <%String name=(String)request.getAttribute("name"); 
LocalDateTime ldt=(LocalDateTime)request.getAttribute("dateTime");
%> --%>

<h4>Name= ${name} <%-- <%=name %> --%></h4>
<h4>Date and Time= ${dateTime} <%-- <%=ldt %> --%></h4>


</body>
</html>