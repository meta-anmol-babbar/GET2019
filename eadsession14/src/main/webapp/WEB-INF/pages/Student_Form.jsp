<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
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


		<form:form method="POST" modelAttribute="studentObj">
			<table>
				<tr>
					<td><form:label path="firstName">First Name</form:label></td>
					<td><form:input path="firstName" placeholder="first name"
							id="fname" /> <br> <form:errors path="firstName" /></td>
				</tr>
				<tr>
					<td><form:label path="LastName">Last Name</form:label></td>
					<td><form:input path="lastName" id="lname"
							placeholder="last name" /> <br> <form:errors
							path="lastName" /></td>
				</tr>
				<tr>
					<td><form:label path="fatherName">Father Name</form:label></td>
					<td><form:input path="fatherName" id="fatherName"
							placeholder="father name" /> <br> <form:errors
							path="fatherName" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email Id</form:label></td>
					<td><form:input path="email" id="email" placeholder="email" />
						<br> <form:errors path="email" /></td>
				</tr>
				<tr>
					<td><form:label path="studentClass">Class</form:label></td>
					<td><form:input path="studentClass" type="number" id="classNo"
							min="1" max="12" style="width : 175px" placeholder="enter class" />
						<br> <form:errors path="studentClass" /></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input path="age" id="age" type="number" min="3"
							max="35" style="width : 175px " placeholder="enter age" /> <br>
						<form:errors path="age" /></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="Submit" id="submit">
		</form:form>
		<br> <br> <span name="result"
			style="font-size: 25px; color: green;"> ${result} </span>
	</div>

</body>
</html>