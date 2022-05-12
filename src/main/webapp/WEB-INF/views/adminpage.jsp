<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="com.springapps.phase3project.entity.Product,com.springapps.phase3project.entity.Admin, java.util.List"  %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome Admin</h1>
	<p></p>
	<form action="addproduct" method="post">
		<input type="submit" value="Add Product"/>
	</form>
	<p></p>
	<form action="updateproduct" method="post">
		<input type="submit" value="Update Product"/>
	</form>
	<p></p>
	<form action="deleteproduct" method="post">
		<input type="submit" value="Delete Product"/>
	</form>
	<p></p>
	<form action="purchasereport" method="get">
		<input type="submit" value="Purchase Reports"/>
	</form>
	<p></p>
	<form action="findproduct" method="get">
		<input type="submit" value="Find Product"/>
	</form>
	<p></p>
	<form action="user" method="get">
		<input type="submit" value="List of Users"/>
	</form>
	<p></p>
	<form action="password" method="post">
		<input type="submit" value="Password Change"/>
	</form>

	

</body>
</html>