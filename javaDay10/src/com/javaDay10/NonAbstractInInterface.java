package com.javaDay10;

import java.util.*;

interface Addition
{
	public void print();
	
	default public void add() {
		int a=10, b=20;
		int sum=a+b;
		System.out.println("Addition of "+a+" abd "+b+" is : "+sum);
	}
	
	public static void add1(int a,int b)
	{
		System.out.println("Addition of "+a+" and "+b+" is : "+(a+b));
	}
}
class Sum implements Addition
{
	public void print()
	{
		System.out.println("This is not abstract method in interface");
	}
}

public class NonAbstractInInterface {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Sum s=new Sum();
		s.add();
		
		System.out.println("\nEnter 1st number :");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd number :");
		int b=sc.nextInt();
		
		Addition.add1(a,b);
		
		
	}

}
