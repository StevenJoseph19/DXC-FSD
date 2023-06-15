<%@ page language="java" import="java.util.*"  contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><jsp:getProperty name="course" property="courseName" /></title>
</head>
<body>
	<div class="container">
		<!--  Header Section -->
		<header>
			<%@ include file="header.jsp"%>
		</header>
		<!--  Main Content of the Page -->
		<article>
			    <jsp:scriptlet>
					String user = (String)session.getAttribute("user");
					String message = "Welcome " + user + "!";		    			    
			    </jsp:scriptlet>
			    
		<b><jsp:expression>message</jsp:expression></b>
		
		<jsp:useBean id="course" class="com.learntoday.model.Course" scope="request"></jsp:useBean>
		
		<div class="panel panel-primary">
			<p class="panel-heading">Course Details</p>
			<div class="panel-body">
				<div class="media">
				<a href="#"><img 
					src = '<jsp:getProperty name="course" property="imageUrl"/>'
					width="300" height="300" /></a>
			</div>
			<div class="media-body">
		<%-- 	<h4 class="media-heading">
			<jsp:getProperty name="course" property="courseName" /></h4>
			<p>
			<strong>Trainer Name : <strong>
			<jsp:getProperty name="course" property="description" />
			</p>
			<p>
			<strong>Course Fee : </a><strong>
			<jsp:getProperty name="course" property="fees" />
			</p> --%>
		
				<h4 class="media-heading">${course.courseName}</h4>
				
				<p><strong>Trainer Name : </strong>
				  	${course.facultyName}
				</p>
	
				<p>
				<strong>Course Description : </strong><br/>
					${course.description}
				</p>
				
				<p><strong>Course Fees : </strong>
					${course.fees}
				</p>
		</div>
	</div>
		<p class="text-center">
		<a href="courses.jsp"  class="btn btn-lg btn-success"> View All Courses</a>
		</p>
	</div>
		</article>

		<!--  Footer Section -->
		<footer>
			<%@ include file="footer.jsp"%>
		</footer>
	</div>
</body>
</html>