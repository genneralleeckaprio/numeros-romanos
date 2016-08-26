package com.genlee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OiNumeros extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// comentei mas nao tenho a certeza
	//	super.service(request, response);
		
		PrintWriter out = response.getWriter();
		out.println("<htmml>");
		out.println("<head>");
		out.println("<title>Primeira Servlet</title");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hellow Servlet numbers World!</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
