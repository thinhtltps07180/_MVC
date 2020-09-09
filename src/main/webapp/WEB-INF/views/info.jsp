<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="alert alert-success">
		<strong>Success!</strong>
	</div>

	<div class="alert alert-info">
		<strong>Info!</strong> ${msg}
	</div>

	<table class="table table-hover">
		<thead>
			<tr>
				<th>Student Name</th>
				<th>Student Hobby</th>
				<th>Student Mobile</th>
				<th>Student DOB</th>
				<th>Student Skills</th>
				<th>Student Address</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${student.studentName}</td>
				<td>${student.studentHobby}</td>
				<td>${student.studentMobile}</td>
				<td>${student.studentDOB}</td>
				<td>${student.studentSkills}</td>
				<td>country: ${student.studentAddreess.country}
					city : ${student.studentAddreess.city}
					street : ${student.studentAddreess.street}
					pincode : ${student.studentAddreess.pincode}
				</td>
			</tr>
		</tbody>
	</table>


</body>
</html>