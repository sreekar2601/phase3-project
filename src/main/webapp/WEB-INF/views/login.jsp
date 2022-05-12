<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="com.springapps.phase3project.entity.Product ,com.springapps.phase3project.entity.Admin, java.util.List"  %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>SportyWear.com</h1>
	<p></p>
	<h1>Login</h1>
	<form action="loginadmin" method="post">
		<table>
			<tr>
				<td>Username:</td> 
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td> 
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td/>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>