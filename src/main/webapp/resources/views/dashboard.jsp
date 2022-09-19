<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no" />
	<meta name="description" content="">
	<meta name="keywords" content="">
	<meta name="author" content="">
	<title>Dashboard | School Information Management System</title>
	<!-- Favicon -->
	<link href="./resources/images/favicon.ico" rel="icon" />
	<!-- FONTS -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
	<!-- STYLE SHEETS -->
	<link href="./resources/styling-libraries/bootstrap-4-css/bootstrap.min.css" rel="stylesheet" />
	<link href="./resources/css/dashboard.css" rel="stylesheet" />
</head>

<body>
	
	<div class="container mt-5">
		<h1>Welcome to dashboard..!</h1>
		<hr><br>
		<h3>User Profile</h3>
		<br>
		<div class="p-5 rounded bg-dark text-light">
			<c:forEach var="user" items="${userDetails}">
				<h6>Id: ${user.id}</h6>
				<h6>Name: ${user.name}</h6>
				<h6>Email: ${user.email}</h6>
				<h6>Password: ${user.password}</h6>
				<h6>NIC: ${user.nic}</h6>
				<h6>Pro pic: ${user.profilePhoto}</h6>
				<h6>U type: ${user.userType}</h6>
				<h6>Email verify: ${user.emailVerified}</h6>
				<h6>EmailVerifyCode: ${user.emailVerifyCode}</h6>
				<h6>PasswordResetCode: ${user.passwordResetCode}</h6>
				<h6>CreatedAt: ${user.createdAt}</h6>
				<h6>UpdatedAt: ${user.updatedAt}</h6>
			</c:forEach>
		</div>
	</div>

	<!--JAVASCRIPT FILES -->
	<script type="text/javascript" src="./resources/styling-libraries/bootstrap-4-js/bootstrap.min.js"></script>
	<script type="text/javascript" src="./resources/js/main.js"></script>
	
</body>
</html>

