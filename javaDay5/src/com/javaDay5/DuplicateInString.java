package com.javaDay5;

public class DuplicateInString {
	public static void main(String args[])
	{
		String str="hello world";
		char str1[]=str.toCharArray();
		
		System.out.println("String is : "+str);
		
		System.out.print("Duplicate Characters in Strin are :" );
		
		for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (str1[i] == str1[j]) {
	               System.out.print(str1[j] + " ");
	               break;
	            }
	         }
	      }
		}

}
