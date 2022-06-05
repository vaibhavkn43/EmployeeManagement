<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Add Employee</h2>
		<!-- create html form(spring form) where user can enter data  -->

		<form:form action="save-employee" modelAttribute="employee"
			method="POST">

			<label>Name :</label>
			<form:input path="name" />
			<br><br>
			<label>Mobile :</label>
			<form:input path="mobile" />
			<br><br>
			<label>Country :</label>
			<form:input path="country" />
			<br><br><br>
			
		
			<!-- <input type="submit" value="Submit"> -->
			<button type="submit">Submit</button>

		</form:form>
	</div>
</body>
</html>