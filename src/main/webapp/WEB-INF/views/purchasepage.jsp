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
	<h1>Purchase Report</h1>
	<table border="1">
		<tr>
			<th>Company</th>
			<th>Size</th>
			<th>Color</th>
			<th>Material</th>
			<th>Category</th>
			<th>Price</th>
			<th>Date</th>
		
		</tr>
		<c:forEach items="${products }" var="pro">
		<tr>
			<td>${pro.company}</td>
			<td>${pro.size}</td>
			<td>${pro.color}</td>
			<td>${pro.material}</td>
			<td>${pro.category}</td>
			<td>${pro.price}</td>
			<td>${pro.date}</td>
		
		
		
		</tr>
		</c:forEach>
	</table>


</body>
</html>