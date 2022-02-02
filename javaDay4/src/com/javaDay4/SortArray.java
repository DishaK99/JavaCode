package com.javaDay4;

import java.util.Scanner;

public class SortArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int [] a = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
			
			System.out.print("Array : ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
				
			}
			System.out.print("\nAfter sorting : ");
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					int temp;
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				System.out.print(a[i]+" ");
				
			}
			  
			
		
		}
}
