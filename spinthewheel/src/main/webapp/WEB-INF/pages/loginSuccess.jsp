<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Rate.it</title>
</head>
<body>
	<h3>Benvenuti su Rate It</h3>
		<table>
			<tr>
				<td>Username: </td>
				<td>${form.username}</td>
			</tr>
			<tr>
				<td>Password: </td>
				<td>${form.password}</td>
			</tr>
		</table>
</body>
</html>
