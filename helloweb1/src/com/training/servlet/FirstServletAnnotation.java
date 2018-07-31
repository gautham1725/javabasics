package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="firstanno",urlPatterns="/fan")
public class FirstServletAnnotation extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Annotation init() called");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("using annotation, service method called");
		PrintWriter out = resp.getWriter();
		out.println("<h1> Welcome to Servlet Hello World "+new Date()+"</h1>");
	}
}
