package com.javaDay5;

public class SwapStrings {

	public static void main(String args[]) {  
        String a = "Hello";  
        String b = "World";  
        String c="";
       System.out.println("Before swap : a = "+ a + ", b =  " + b);  
        
        //a = a + b;  
       // b = a.substring(0, a.length() - b.length());  
       // a = a.substring(b.length());  
        c=a;
        a=b;
        b=c;
        System.out.println("After swap : a = "+ a + ", b =  " + b);  
    }  
}
