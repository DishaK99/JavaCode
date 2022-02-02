package com.javaDay4;

public class MinFromArray {
	public static void main(String[] args) {  
		  
      
        int [] arr = new int [] {25, 11, 7, 75, 56}; 
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        	
        }
       
        int min = arr[0];  
        for (int i = 0; i < arr.length; i++) {  
         
           if(arr[i] <min)  
               min = arr[i];  
        }  
        System.out.println("\nSmallest element in an array : " + min);  
    }  

}
