<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body, html {
	margin: 0;
	height: 100%;
	width: 100%;
	background: linear-gradient(#D4ECDD, #79B4B7)
}

.maindiv {
	height: 50%; display : flex;
	align-items: center;
	justify-content: center;
	display: flex;
}

form {
	background-color: #F7F6F2;
	width: 300px;
	height: 300px;
	display: flex;
	align-items: center;
	justify-content: center;
	border-radius: 10px;
}
.btn {
	padding:10px;
	text-align: center;
}
</style>
</head>
<body>

	<h1 style="text-align: center;">Register Page</h1>
	<br>
	<hr>
	<br>
	<div class="maindiv">

		<form:form method="post" action="save">

		
			<div >
				<label>Roll Number: </label><br> 
				<input type="text" name="rollnumber"><br> 
				
				<label>First name </label><br>
				<input type="text" name="firstName"><br> 
				
				<label>Last Name: </label><br> 
				<input type="text" name="lsatName"><br>
				
				<label>mobile number: </label><br> 
				<input type="text"name="mo_number"><br>
				 
				<label>city: </label><br> 
				<input type="text" name="city"><br>
				
			<div class="btn"><button type="submit" >Register</button></div>	
			</div>
			</form:form>
	

	</div>

</body>
</html>