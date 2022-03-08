package com.javaDay12;

import java.util.*;

class Activity
{
	String string1;
	String string2;
	String operator;
	
	public Activity(String string1, String string2, String operator) 
	{
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
	
	
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	
}


public class Source {

	 public String doOperation(Activity a)
	  {
	      String s=a.string1+a.string2;
	      switch(a.operator)
	      {
	          case "+":
	          return (a.string1+a.string2);
	          
	          case "-":
	          return (s.replace(s,a.string2));
	          
	          default:
	        	  return "";
	      }
	  
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String opr = sc.next();
		Activity obj1 = new Activity(str1, str2, opr);
	
	}
}