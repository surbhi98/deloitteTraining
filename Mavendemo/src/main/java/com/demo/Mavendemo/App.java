package com.demo.Mavendemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {	
    	
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	Class.forName("com.mysql.jdbc.Driver");
        System.out.println( "Hello World!" );
    }
}
