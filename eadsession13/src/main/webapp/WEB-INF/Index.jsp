<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Student Application</title>
<style>
div {
	padding-top: 20px;
	text-align: center;
}
</style>
</head>
<body>
	<div>

		<h1>${msg}</h1>
		<span style="color: red"> ${denied} </span><br>
		<br> <a href="studentForm"> Add Student</a><br>
		<br> <a href="showStudents">Show All Student</a><br>
		<br> <a href="/logout">Log Out</a><br>
		<br>

	</div>

</body>
</html>

