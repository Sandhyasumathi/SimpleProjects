<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link type=text/css rel="stylesheet" href="./style.css">
<link type=text/css rel="stylesheet" href="./add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>CRM APP Registration form</h1>
		</div>
	</div>

	<form:form action="registerCustomer" modelAttribute="customer">
		<table>
			<form:hidden path="id" />
			<tr>
				<th>Customer First Name</th>
				<td><form:input path="fname" /></td>
			</tr>
			<tr>
				<th>Customer Last Name</th>
				<td><form:input path="sname" /></td>
			</tr>
			<tr>
				<th>Customer City</th>
				<td><form:input path="city" /></td>
			</tr>

			<tr>

				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>