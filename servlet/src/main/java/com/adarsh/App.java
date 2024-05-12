package com.adarsh;

import javax.servlet.Servlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );

        Tomcat tomcat=new Tomcat();

        Context context=  tomcat.addContext("", null);
     Tomcat.addServlet(context,"HelloServlet", new HelloServlet());

        context.addServletMappingDecoded("/hello", "HelloServlet");
        tomcat.start(); // start server
        tomcat.getServer().await(); // let the server wait for request
    }
}
