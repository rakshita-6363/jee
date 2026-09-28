package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String uname=req.getParameter("name");
		String upassword=req.getParameter("password");
		System.out.println("Welcome "+uname);
		PrintWriter out=resp.getWriter();
		out.print("Welcome "+uname+" ur password is "+upassword);
		
	}
	

}
