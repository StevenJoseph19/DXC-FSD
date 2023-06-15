<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Fundamentals: Declarations</title>
</head>
<body>
	<%!double getBonus(double salary) {
		return salary * 0.05;
	}%>
	<p>
		Bonus for the employee with salary 5000 will be :
		<%=getBonus(5000)%>
	</p>
</body>
</html>