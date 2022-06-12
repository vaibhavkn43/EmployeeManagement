<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee : Management</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<!-- <link rel="stylesheet" type="text/css" href="/Employee-Management/URLToReachResourcesFolder/css/background.css"> -->
<link rel="stylesheet" type="text/css"
	href="/Employee-Management/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>
<body class="myFonts">
	<div align="center" class="container">
		<h1>CDAC - HCDC</h1>
		<h1>Employee-Management</h1>

		<div align="left">
			<form action="/Employee-Management/showEmployeeForm">
				<!-- < button type="submit" >Add</button> -->
				<input type="submit" value="ADD" class="btn btn-primary"> <br>
				<br>
			</form>
		</div>
		<%-- 	${employees} --%>
		<table border="1" class="table table-striped">
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
					<td><a
						href="/Employee-Management/updateEmployee?userId=${emp.id}">Update</a></td>
					<td><a
						href="/Employee-Management/deleteEmployee?userId=${emp.id}"
						onclick="if(!(confirm('Are You Sure You Want To Delete This Employee?')))return false">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<br> <br> <img alt="employee"
			src="/Employee-Management/URLToReachResourcesFolder/images/employee.jpg"
			align="bottom">
	</div>
</body>
</html>