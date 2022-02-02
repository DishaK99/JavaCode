package com.javaDay4;

public class SumOfArray {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		System.out.print("Array elements are : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("\nSum of all elements in an array is : "+sum);

}
}
