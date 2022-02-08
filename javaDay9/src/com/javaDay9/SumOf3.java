package com.javaDay9;

interface SumOfThree
{
	public int sum(int x,int y,int z);
}

public class SumOf3 {
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		
		SumOfThree total=(x,y,z)->
		{
			return x+y+z;
		};
		System.out.println(total.sum(a, b, c));
		
	}

}
