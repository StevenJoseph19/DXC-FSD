<%@ page language="java" import="java.sql.*, java.util.*"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<%!
	Connection con;

	private boolean isValidUser(String userName,String password){
		try{
			String sql = "select * from users where name = ? and password = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,userName);
			ps.setString(2,password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
				return true;
		} catch(Exception ex){
			ex.printStackTrace();
		}
		
		return false;
	}
%>

<%
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	
	String driverClass = application.getInitParameter("dbDriver");
	String url = application.getInitParameter("dbUrl");
	String dbUserName = application.getInitParameter("dbUser");
	String dbPassword = application.getInitParameter("dbPwd");
	
	try{
		Class.forName(driverClass);
	} catch(Exception ex){
		ex.printStackTrace();
	}
	
	con = DriverManager.getConnection(url,dbUserName,dbPassword);
	
	application.setAttribute("connection", con);
	
	boolean authFlag = isValidUser(userName, password);
	
	if(authFlag){
		session.setAttribute("user", userName);
		String rurl = request.getParameter("requestUrl");
		if( rurl != null && !rurl.equals(null))
			response.sendRedirect(rurl + ".jsp");
		response.sendRedirect("courses.jsp");
	} else {
		response.sendRedirect("error.jsp");
	}

%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>

</body>
</html>