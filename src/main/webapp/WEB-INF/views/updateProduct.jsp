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
<h1>Update Product</h1>
	<form action="update" method="post">
		<table>
			<tr>
				<td>Company:</td> 
				<td><input type="text" name="company" /></td>
			</tr>
			<tr>
				<td>Size:</td> 
				<td><input type="text" name="size" /></td>
			</tr>
			<tr>
				<td>Color:</td> 
				<td><input type="text" name="color" /></td>
			</tr>
			<tr>
				<td>Material:</td> 
				<td><input type="text" name="material" /></td>
			</tr>
			<tr>
				<td>Category:</td> 
				<td><input type="text" name="category" /></td>
			</tr>
			<tr>
				<td>Price:</td> 
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>Date:</td> 
				<td><input type="text" name="date" /></td>
			</tr>
			<tr>
				<td/>
				<td><input type="submit" value="Update Product" /></td>
			</tr>
		</table>
	</form>
</body>
</html>