package com.javaDay4;

public class MaxInArray {
	public static void main(String[] args) {  
		  
	      
        int [] arr = new int [] {25, 11, 7, 75, 56}; 
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        	
        }
       
        int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {  
         
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("\nLargest element in an array : " + max);  
    }  


}
