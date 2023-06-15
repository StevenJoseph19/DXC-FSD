package com.dxc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Preview
 */
@WebServlet("/Preview")
public class Preview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Preview() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String guestName = request.getParameter("guestName");
		String email = request.getParameter("email");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Preview </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Please confirm your information </h3>");

		out.println("<p>Guest Name : " + guestName + "</p>");
		out.println("<p>Email Id : " + email + "</p>");
		out.println("<form name='frm' action='SaveData' method='POST'>");

		out.println("<input type='hidden' name= 'guestName' value='" + guestName + "'/>");
		out.println("<input type='hidden' name= 'email' value='" + email + "'/>");
		out.println("<p> <input type='submit' value = 'Save Data' name= 'btnSave' /> </p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		doGet(request, response);
		String email = request.getParameter("email");
		HttpSession session = request.getSession();
		String guestName = (String) session.getAttribute("guestName");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Preview </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Please confirm your information </h3>");

		out.println("<p>Guest Name : " + guestName + "</p>");
		out.println("<p>Email Id : " + email + "</p>");
		
		session.setAttribute("email", email);
		
		out.println("<form name='frm' action='SaveData' method='POST'>");
		out.println("<p> <input type='submit' value = 'Save Data' name= 'btnSave' /> </p>");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");

	}

}
