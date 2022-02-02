package com.javaDay5;

public class IsStringPalindrome {

	public static void main(String[] args) {

		  String str = "ABCBA";
		  String revString = "";
		  
		  System.out.println(str);

		  for (int i = str.length() - 1; i >= 0; --i) {
		   revString += str.charAt(i);
		  }

		  System.out.println(revString);
		 
	if(str.equals(revString))
	{
		System.out.println("String is Palindrome");
	}
	else
		System.out.println("String is not Palindrome");

}
}
