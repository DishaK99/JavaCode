package com.javaDay5;

public class WrapperClass {
	public static void main(String args[])
	{
		int a=10;
		Integer i=new Integer(10);
		i=a;
		System.out.println(i);
		
		String str="10";
		i=Integer.parseInt(str);
		System.out.println(i);
		
		
		
	}

}
