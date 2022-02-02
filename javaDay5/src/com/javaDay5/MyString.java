package com.javaDay5;



public class MyString {
public static void main(String args[])
{
	String str="hello String";
	
	String str1=new String();
	
	String str2=new String("Hello String");
	
	//length()
	System.out.println(str.length());
	
	//isEmpty()
	if(str1.isEmpty())
	{
		System.out.println("String is Empty");
	}
	else
	{
		System.out.println("String is  not Empty");
	}
	
     //charAt()
	System.out.println(str2.charAt(0));
	
	//codePointAt()
	System.out.println(str2.codePointAt(0));
	
	//equals()
	if(str2.equals(str1))
	{
		System.out.println("Both are equal");
	}
	else
	{
		System.out.println("Both are not equal");
	}
	
	//compareTo
	String str4="D";
	String str5="A";
	//if first < second -1
	//if first > second 1
	//first == second 0
	System.out.println(str4.compareTo(str5));
	
	//startWith
	System.out.println(str1.startsWith("H"));
	
	//subString
	System.out.println(str.substring(2));
	
	System.out.println(str.substring(2,5));
	
	//concat()
	System.out.println(str.concat("H"));
	
	System.out.println(str.concat(" "+str2));
	
	//contains();
	System.out.println(str.contains("llo"));
	
	//toLowerCase()
	System.out.println(str.toLowerCase());
	
	//toUpperCase()
	System.out.println(str.toUpperCase());
	
	
	//trim()
	System.out.println(str.trim());
	
	String str6="java";
	String str7="java";
	System.out.println(str6.hashCode());
	System.out.println(str7.hashCode());
	
	String str8=new String("java");
	System.out.println(str8.hashCode());
}
}
