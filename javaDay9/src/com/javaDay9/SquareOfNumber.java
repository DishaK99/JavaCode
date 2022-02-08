package com.javaDay9;

interface Square
{
	public int square(int a);
}

public class SquareOfNumber {

	public static void main(String args[])
	{
		Square sq=(a)->{
			return a*a;
		};
		System.out.println("Square = "+sq.square(10));
	}
}
