package com.Day1Java;

public class CheckCompoundIntrest {
	public static void main(String args[])
	{
		int p=2000, t=5, n=12;
		double r=0.08;
		double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
	}


}
