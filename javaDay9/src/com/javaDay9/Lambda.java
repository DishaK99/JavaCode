package com.javaDay9;

import java.util.*;

/*
 Lambda
 - top to bottom approach
 - java 1.8 feature
 - stream API
 - 
 
 */
interface MyCode
{
	public void print();
}
interface MySum
{
	public void sum(int a, int b);
}
interface EvenOrOdd
{
	public String findValue(int num);
}

public class Lambda {
	public static void main(String args[])
	{
		//storing the value into a variable
		int a=10;
		int b=10;
		System.out.println(a);
		
		//java 8 allows to store code(Function) into a variable
		//pass the function to java code
		//type is not allowed bcoz it is storing in variable(Access modifier)
		//remove return type, it will automatically understand
		//method name- add lambda with method name i.e. ->
		//remove method name bcoz we will not call it
		//if u have lambda on rightside u must have an interface
		MyCode code= ()->System.out.println("My method");
		//execute code late
		code.print();
		
		MySum  sum1=( x, z)->{
			int c=x+z;	
		System.out.println(c);};
		sum1.sum(10, 20);
		
		//
		EvenOrOdd evenOrOdd=(num) -> {
			if(num%2==0)
			{
				return "Even "+num;
			}
			else
			{
				return "Odd "+num;
			}
			
		};
		System.out.println(evenOrOddValue(10));
		
	}
	public static String evenOrOddValue(int a)
	{
		if(a%2==0)
		{
			return "Even "+a;
		}
		else
		{
			return "Odd "+a;
		}
		
	}
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void print()
	{
		System.out.println("My method");
		
	}
	

}
