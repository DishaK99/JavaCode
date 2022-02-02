package com.javaDay4;

import java.util.Scanner;

public class FindElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		boolean temp=false;
		int a[]=new int[5];
		System.out.println("Enter 5 elemnts in an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter an element you want to find in an array :");
		int find=sc.nextInt();
		
		
		System.out.println("Array element is :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==find)
			{
				temp=true;
				break;
			}
			else
			{
				temp=false;
			}
			
		}
		if(temp)
		{
			System.out.println("Element is present in an array");
		}
		else
		{
			System.out.println("Element is not present in an array");
		}
				
	}

}
