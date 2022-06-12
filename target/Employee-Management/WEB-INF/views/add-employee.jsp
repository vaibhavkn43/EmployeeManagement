<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/Employee-Management/URLToReachResourcesFolder/css/background.css">
<link rel="stylesheet" type="text/css" href="/Employee-Management/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>
<body>

	<div align="center">
		<h1>Add Employee</h1>
		<br>
		<!-- create html form(spring form) where user can enter data  -->

		<form:form action="save-employee" modelAttribute="employee"
			method="POST">
			
			<form:hidden path="id" />
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
			<button type="submit" class="myButton">Submit</button>

		</form:form>
	</div>
</body>
</html>