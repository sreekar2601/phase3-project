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
	<h1>Delete Product</h1>
	<form action="delete" method="post">
		<table>
			<tr>
				<td>Company:</td> 
				<td><input type="text" name="company" /></td>
			</tr>
			<tr>
				<td/>
				<td><input type="submit" value="Delete Product" /></td>
			</tr>
		</table>
	</form>
</body>
</html>