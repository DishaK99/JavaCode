package com.javaDay4;

public class AvgofArray {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int avg=0, sum=0;
		System.out.print("Array elements are : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("\nAverage an array is : "+avg);

}

}
