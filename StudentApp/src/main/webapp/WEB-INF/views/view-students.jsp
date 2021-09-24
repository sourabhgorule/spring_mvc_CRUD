<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Student List</h1>
	<button>	<a href="addstudent">Add New Student</a> </button>
	<button><a href="index">home</a></button>
	<table border="2" width="100%" cellpadding="2">
		<tr>
			<th>Roll Number</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>mobile number</th>
			<th>city</th>
			<th colspan="2">Modify</th>
			
		</tr>
		<c:forEach var="student" items="${studentList}">
			<tr>
				<td>${ student.rollnumber }</td>
				<td>${ student.firstName }</td>
				<td>${ student.lsatName }</td>
				<td>${student.mo_number }</td>
				<td>${student.city }</td>
				<td> <a href="edit?rollnumber=${student.rollnumber }">Edit</a> </td>
				<td><a href="delete?rollnumber=${student.rollnumber }">Delete</a></td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>