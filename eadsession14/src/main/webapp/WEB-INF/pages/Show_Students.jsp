<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table {
	margin: auto;
}

td, th {
	padding: 20px;
}
</style>
</head>
<body>

	<div align=center>

		<table>
			<tr>
				<td><a class="active" href="index">Home</a></td>
				<td><a href="studentForm">Add Student</a></td>
				<td><a href="showStudents">See Students</a></td>
				<td><a href="/logout">Log Out</a></td>
			</tr>
		</table>
		<h2>Student Details</h2>
		<br>
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Father's Name</th>
				<th>Student's Email</th>
				<th>Student's Class</th>
				<th>Student's Age</th>
			</tr>

			<c:forEach items="${students}" var="studentsList">
				<tr>
					<td>${studentsList.getFirstName()}</td>
					<td>${studentsList.getLastName()}</td>
					<td>${studentsList.getFatherName()}</td>
					<td>${studentsList.getEmail()}</td>
					<td>${studentsList.getStudentClass()}</td>
					<td>${studentsList.getAge()}</td>
				</tr>
			</c:forEach>
		</table>

	</div>

</body>
</html>