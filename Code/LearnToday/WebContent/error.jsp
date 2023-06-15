<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isErrorPage="true" import="java.sql.SQLException" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page - LearnToday</title>
</head>
<body>
	<div class="container">
		<!--  Header Section -->
		<header>
			<%@ include file="header.jsp"%>
		</header>
		<!--  Main Content of the Page -->
		<article>
			<div class="alert alert-danger">
				<%
				String imageUrl = config.getInitParameter("imageUrl");
				String errorMessage = config.getInitParameter("errorMessage");
				

				
				out.println("<center><img src='" + imageUrl + "' alt='" + errorMessage + "'/>");
				out.println("<h1>Oops!...<br>" + errorMessage + "</h1></center>");
				%>
			</div>
		<a href="javascript:history.back()" class="btn btn-lg btn-warning">Go Back</a>
		</article>

		<!--  Footer Section -->
		<footer>
			<%@ include file="footer.jsp"%>
		</footer>
	</div>
</body>
</html>