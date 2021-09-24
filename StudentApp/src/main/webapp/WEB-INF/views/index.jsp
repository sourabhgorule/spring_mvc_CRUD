<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

@import url('https://fonts.googleapis.com/css2?family=Anton&display=swap');
html,body{
	margin: 0;
	height: 100%;
	width: 100%;
}
.mainDiv {
	display: flex;
	background-color: #D4ECDD;
	padding: 15px
}

a {
	text-decoration:none;
	color: #630A10;
	padding: 10px;
	font-size: 25px;
}

a:hover {
	color: #FF0000;
}
.right{
	width:100%;
	display: flex;
	align-items: center;
	justify-content:flex-end;
}
b{
	font-size: 30PX;
	font-family: 'Anton', sans-serif;
}
</style>

</head>
<body>


	<div class="mainDiv">


		<div class="left">
			<b>StudentInfo</b>
		</div>
		<div class="right">
			<div >
				<a href="addstudent">Add Student </a>
			</div>
			<div >
				<a href="view">View Students</a>
			</div>
		</div>


	</div>

</body>
</html>