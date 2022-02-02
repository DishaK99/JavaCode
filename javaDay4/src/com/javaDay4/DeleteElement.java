package com.javaDay4;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
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
		System.out.println("\nEnter an element you want to delete from an array :");
		int del=sc.nextInt();
		
		System.out.println("Array after deleting an element :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==del)
			{
				continue;
			}
			System.out.print(a[i]+" ");
		}
		
	}

}
