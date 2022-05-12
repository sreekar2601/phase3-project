<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="com.springapps.phase3project.entity.Product,com.springapps.phase3project.entity.Admin, java.util.List"  %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

<h1>Users: </h1>
<table border="1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>Items</th>
		
	
	</tr>
	
	<c:forEach items="${users}" var="user">
	<tr>
		<td>${user.id}</td>
		<td>${user.name}</td>
		<td>${user.email}</td>
		<td>${user.items}</td>
		
	
	</tr>
	</c:forEach>
</table>

</body>


</html>