package com.adarsh;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	System.out.println("In Service");
    PrintWriter out=res.getWriter();
    (res).setContentType("text/html");
    out.println("<h1>Hello</h1>");
}	


}