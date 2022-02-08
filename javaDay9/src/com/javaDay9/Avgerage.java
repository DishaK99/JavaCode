package com.javaDay9;

interface Avg
{
	public void averageOfNum(int a,int b, int c);
}

public class Avgerage {
	public static void main(String args[])
	
	{
		int x=10,y=20,z=30;
		Avg avg=(a,b,c)->
		{
			double average=(10+20+30)/3;
			System.out.println("Average is : "+average);
		};
		avg.averageOfNum(x,y,z);
		
	}

}
