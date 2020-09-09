<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	<div class="container">
		<div class="row">
			<form:errors path="studentBidding.*" />
			<form action="submitAddForm" method="post">
				<div class="form-group">
					<label for="email">Student's Name:</label> <input type="text"
						class="form-control" id="name" name="studentName">
				</div>
				<div class="form-group">
					<label for="pwd">Student's Hobby :</label> <input type="text"
						class="form-control" id="hobby" name="studentHobby">
						
				</div>
				<div class="form-group">
					<label for="pwd">Student's Mobile :</label> <input type="text"
						class="form-control" id="mobile" name="studentMobile">
				</div>
				<div class="form-group">
					<label for="pwd">Student's DOB :</label> <input type="text"
						class="form-control" id="DOB" name="studentDOB">
				</div>
				<div class="form-group">
					<label>Student's Skills set :</label> 
					<select name="studentSkills" multiple="multiple"
						class="form-control">
						<option value="Java core" label="Java core"></option>
						<option value="Jsp Servlet" label="Jsp Servlet"></option>
						<option value="Spring MVC" label="Spring MVC"></option>
					</select>
				</div>
				<div class="form-group">
					<label for="pwd">Student's country :</label> <input type="text"
						class="form-control" id="DOB" name="studentAddreess.country">
				</div>
				<div class="form-group">
					<label for="pwd">Student's city :</label> <input type="text"
						class="form-control" id="DOB" name="studentAddreess.city">
				</div>
				<div class="form-group">
					<label for="pwd">Student's street :</label> <input type="text"
						class="form-control" id="DOB" name="studentAddreess.street">
				</div>
				<div class="form-group">
					<label for="pwd">Student's pincode :</label> <input type="text"
						class="form-control" id="DOB" name="studentAddreess.pincode">
				</div>

				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>