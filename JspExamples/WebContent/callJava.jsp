<%@page import="org.apache.jasper.compiler.Node.UseBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.jsp.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.jsp.Employee" scope="request"></jsp:useBean>
<jsp:setProperty property="id" name="emp" value="23"/>
<jsp:getProperty property="id" name="emp"/>


<%-- <% Employee emp1 = new Employee();
emp1.setEmpId(23);
out.println(emp.getEmpId());
 %>
 --%>
 
</body>
</html>