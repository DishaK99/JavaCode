package com.Day1Java;

import java.util.*;

public class CheckEvenOrOddWithRange {
	public static void main(String args[])
	{
		for(int i=1;i<=20;i++)
		{
			if(i==10)
				continue;
		
		if(i%2==0)
			System.out.println(i+" is even number");
		else
			System.out.println(i+" is odd number");
		
		}
		
	}


}
