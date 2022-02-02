package com.javaDay5;

public class ExceptionHandling {
	public static void main(String args[])
	{
		try
		{
			
		//Checked Exception
		//Unhandled exception type FileNotFoundException
			//Compiler force to handle these Exception
		
			
			
		int a[]=new int[5];
		//ArrayIndexOutOfBoundsException
		//MyArray size of 5
		//I am trying to access the 7 location
		//a[7]=10;
			
		//Syntax error, insert ";" to complete BlockStatements
		//int a=10
		System.out.println("Hello first line");
		//Type mismatch: cannot convert from String to int
		//int a="hello";
		
		//No Syntax error is here
		//Exception Name: NullPointerException
		String str=null;
		System.out.println(str.substring(5));
		//break the flow because of exception
		System.out.println("Hello Java");
		}
		catch(Exception e)
		{
			//it will print the exception name
		e.printStackTrace();
		//it will print the exception name
		//System.out.println(e.getMessage());
		//System.out.println("Error in str . Please give some value");
		}
	}

}
