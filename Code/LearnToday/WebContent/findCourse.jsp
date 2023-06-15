<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Course - LearnToday</title>
</head>
<body>
	<jsp:scriptlet>
	String userName = (String)session.getAttribute("user");
	if(userName == null)
		response.sendRedirect("login.jsp?requestUrl=findCourse");
	else{
  </jsp:scriptlet>
	<jsp:useBean id="course" class="com.learntoday.model.Course" scope="request"></jsp:useBean>

	<jsp:declaration>String courseName = null;</jsp:declaration>

	<jsp:scriptlet>
  
	  String facultyName = null;
	  String courseName = null;
	  int courseFee = 0;
	  
	  courseName = request.getParameter("courseName");
	  courseName = courseName.trim();
	  
	  System.out.println("course name selected :: " + courseName);
	  
	  Connection con = (Connection)application.getAttribute("connection");
	  String sql = "select * from course where courseTitle = '" +courseName +"'";
	  Statement stmt = con.createStatement();
	  ResultSet rs = stmt.executeQuery(sql);
	  
  
  if(rs.next()){
  </jsp:scriptlet>
  
  	<jsp:setProperty name="course" property="courseName"  value="<%= courseName %>" />
  	<jsp:setProperty name="course" property="facultyName"  value="<%= rs.getString(3) %>" />
  	<jsp:setProperty name="course" property="imageUrl"  value="<%= rs.getString(4) %>" />
  	<jsp:setProperty name="course" property="fees"  value="<%= rs.getInt(5) %>" />
  	<jsp:setProperty name="course" property="description"  value="<%= rs.getString(6) %>" />
  	
    <jsp:scriptlet>
  		}
    </jsp:scriptlet>
    
 <jsp:forward page="viewCourse.jsp"/> 
 <%
	}
 %>

</body>
</html>