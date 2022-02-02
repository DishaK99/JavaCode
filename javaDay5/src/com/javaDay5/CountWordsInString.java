package com.javaDay5;

import java.util.*;

public class CountWordsInString {
	public static void main(String args[])
    {
	 
	        String str="Hello World";
	        System.out.println(str);
	        int cnt=1;
	        
	        int ln=str.length();
	        for(int i=0;i<ln;i++)
	        {
	          if(str.charAt(i)==' ')
	          {
	            cnt++;
	          }
	        }
	        System.out.println("The string contains "+cnt+ " words.");
	        
	        
	    } 
    

}
