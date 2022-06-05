<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee : Management</title>
</head>
<body>
	<div align="center">
		<h1>CDAC - HCDC</h1>
		<form action="/Employee-Management/showEmployeeForm">
			<button type="submit">Add</button>
			<br>
			<br>
		</form>
		<%-- 	${employees} --%>
		<table border="1">
			<thead>
				<tr>
					<td><b>ID</b></td>
					<td><b>Name</b></td>
					<td><b>Mobile</b></td>
					<td><b>Country</b></td>
				</tr>
			</thead>
			<c:forEach var="emp" items="${employees}">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.mobile}</td>
					<td>${emp.country}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>