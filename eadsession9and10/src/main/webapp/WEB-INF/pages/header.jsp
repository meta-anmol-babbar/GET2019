<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parking System</title>

</head>
<body>
	<div class="logo">
		<div style="float: left; width: 40%; margin: auto">
			<%
				if (session.getAttribute("email") != null) {
			%>
			<span><%=session.getAttribute("email")%></span>

			<%
				} else {
			%>
			<span>not logged in</span>
			<%
				}
			%>
		</div>
		<div style="width: 60%; margin: auto; padding-left: 5px;">

			Parking System</div>




	</div>
	<div class="ifLogin"></div>
	<div>

		<a href="home">Home</a> <a href="friends"> Friends</a> <a
			href="editUserProfile"> Edit profile</a> <a
			href="viewProfile?email=<%=session.getAttribute("email")%>">View
			profile</a> <a href="#contact">Contact</a> <a href="#about">About</a>

		<class="log"> <%
 	if (session.getAttribute("email") != null) {
 %> <a href="logout">Log Out</a> <%
 	} else {
 %> <a href="login">Log in</a> <%
 	}
 %> <class="log"> <%
 	if (session.getAttribute("email") != null) {
 %> <a class="imgA" href="uploadPhoto"> <img
			src="images/<%=session.getAttribute("image")%>" alt="profile picture"
			style="display: inline-block; width: 42px; height: 42px;">
		</a> <%
 	}
 %>
		
	</div>
</body>
</html>