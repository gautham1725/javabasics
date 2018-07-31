package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init() called");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		System.out.println("doGet() method called");
		PrintWriter out = resp.getWriter();
		out.println("<h1> Welcome to Servlet Hello World "+new Date()+"</h1>");
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
			System.out.println("doPost() method called");
			PrintWriter out = resp.getWriter();
			out.println("<h1> Welcome to Servlet Hello World "+new Date()+"</h1>");
			
			String name = req.getParameter("name");
			String age = req.getParameter("age");
			out.println("<h1> name ="+name+" , "+"age ="+age+"</h1>");
			
			Enumeration<String> nameEnumeration = req.getHeaderNames();
			while(nameEnumeration.hasMoreElements()) {
				String headerName = nameEnumeration.nextElement();
				Enumeration<String> valueEnumeration = req.getHeaders(headerName);
				while(valueEnumeration.hasMoreElements()) {
				String headerValues = valueEnumeration.nextElement();
				out.println("<h1> "+headerName+" = "+headerValues+"</h1>");
				}
			}
		}

}
