package com.learntoday.servlet.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un= request.getParameter("uname");
		String pw= request.getParameter("pass");
		
		PrintWriter out=response.getWriter();
		Cookie ck=new Cookie("auth", un);
		ck.setMaxAge(600);
	    if(un.equals("learntoday")&pw.equals("learntoday"))
	    {
	    	response.addCookie(ck);
	    	response.sendRedirect("home.jsp");
	    	return;
	    }
	    else
	    {
	    	RequestDispatcher rd = request.getRequestDispatcher("login.html");
	        out.println("<font color=red>Either user name or password is wrong.</font>");
	        rd.include(request, response);
	    }
	}

}
