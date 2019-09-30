<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>MetaCube</div>
		</div>
		<br>
		<div class="login">
			<form:form action="perform_login" method="post">
				<input type="text" name="username" placeholder="username"/> <br>
				<input type="password" name="password" placeholder="password"/>
				<input type="submit"/>
			</form:form>
		</div>

</body>
</html>