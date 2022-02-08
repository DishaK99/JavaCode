package com.javaDay9;

interface FindValue
{
	public void positiveOrNegative(int a);
}

public class PositiveOrNegative {
	public static void main(String args[])
	{
		FindValue find=(a)->{
			if(a>0)
			{
				System.out.println(a+" is a positive number");
			}
			else
			{
				System.out.println(a+" is a negative number");
			}
		};
		find.positiveOrNegative(10);
	}

}
