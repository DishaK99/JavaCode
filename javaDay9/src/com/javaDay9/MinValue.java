package com.javaDay9;

interface MinNumber
{
	public void minimum();
}

public class MinValue {

	public static void main(String[] args) {
		MinNumber minNum=()->
		{
			int [] arr ={25, 11, 7, 75, 56}; 
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
		};
		minNum.minimum();
		
	}

}
