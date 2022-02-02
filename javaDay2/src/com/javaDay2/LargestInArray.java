package com.javaDay2;

import java.util.*;

public class LargestInArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int max;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a number");
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			 if(a[i] > max)  
	               max = a[i];  
	        }  
				
			System.out.println();
		System.out.println("Largest element in an array is : "+max);
		
	}

}
