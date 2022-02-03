package com.Day1Java;

import java.util.*;

public class IsLeapYear {
	public static void main(String[] args){
	      int year;
	      System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (year%4==0)
	         System.out.println(year+" year is a leap year");
	      else
	         System.out.println(year+" year is not a leap year");
	   }

}
