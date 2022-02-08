package com.javaDay9;

import java.util.*;

//create Lambda to pass String and return in Upper case

interface UpperCase
{
	public String upper(String str);
}

public class StringInUpperCase {

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String : ");
	String s=sc.nextLine();
	
	UpperCase uc=(str)->
			{
				return str.toUpperCase();		
			};
			System.out.println("String in UpperCase : "+uc.upper(s));
	}
}
