package com.javaDay5;

public class CountOccurenceInString {
	public static void main(String[] args){
		String str = "Hello World";
		System.out.println(str);
		// count occurrence 
		int count = 0;
	    for (int i=0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'o')
	        {
	             count++;
	        }
	    }
		System.out.println("occurrence of a: "+count);
	}

}
