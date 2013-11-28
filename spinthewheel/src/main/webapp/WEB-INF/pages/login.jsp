<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Rate.it</title>
</head>
<body>
	<h3>Benvenuti su Rate It</h3>
	<form:form commandName="form">
		<table>
			<tr>
				<td>User Name:<FONT color="red"><form:errors path="username" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Password:<FONT color="red"><form:errors path="password" /></FONT></td>
			</tr>
			<tr>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Invia" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
