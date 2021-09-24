<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<form:form action="updateRecord" method="post">
	
			Roll Number: <form:input path="rollnumber"/> <br>
			
			First Name: <form:input path="firstName"/> <br>
			
			Last Name:<form:input path="lsatName"/> <br>
			
			Mobile number: <form:input path="mo_number"/> <br>
			
			city: <form:input path="city"/> <br> <br>
			
			<input type="submit" value="update">
			
			
			
	
	
	</form:form>

</body>
</html>