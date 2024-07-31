package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/registration")
public class User extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =request.getParameter("username");
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		 HttpSession session = request.getSession();
	        session.setAttribute("user",username);

	        // Set a request attribute
	        session.setAttribute("message", "Hello, ");
	        
	        // Forward to a JSP page
	        request.getRequestDispatcher("hello.jsp").forward(request, response);
	

		
		
		

		
	}
}
