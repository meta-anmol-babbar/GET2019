<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
<style>
div {
	text-align: center;
}

p {
	margin: auto;
	text-align: center;
}

table {
	margin: auto;
}

td, th {
	padding: 20px;
}

.error {
	color: #ff0000;
	font-weight: bold;
}
</style>
</head>
<body>
	<div>
		<h2>
			<spring:message code="lbl.page" text="Student Details" />
		</h2>
		<br />
		 <form:form method="POST"  modelAttribute="studentObj">
			<table>
				<tr>
					<td><form:label path="firstName">First Name</form:label></td>
					<td><form:input path="firstName" /></td>
					<td><form:errors path="firstName" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="lbl.lastName" text="Last Name" /></td>
					<td><form:input path="lastName" /></td>
					<td><form:errors path="lastName" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="lbl.fatherName" text="Father's Name" /></td>
					<td><form:input path="fatherName" /></td>
					<td><form:errors path="fatherName" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="lbl.email" text="Email Id" /></td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="lbl.studentClass" text="Class" /></td>
					<td><form:input path="studentClass" type="number" /></td>
					<td><form:errors path="studentClass" cssClass="error" /></td>
				</tr>

				<tr>
					<td><spring:message code="lbl.age" text="Age" /></td>
					<td><form:input path="age" type="number" /></td>
					<td><form:errors path="age" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="3"> <input type="submit"  value="Submit" id="submit"></td>
				</tr>
			</table>
		</form:form>
		 <span name = "result" style="font-size:25px;color: green;"> ${result} </span><br>
		 <a class="active" href="/index">Home</a><br>
 			<a href="studentDetails">Add Student</a><br>
		  	<a href="showStudents">See Students</a><br>
	</div>
</body>
</html>
