package com.javaDay9;
import java.util.*;

interface Combine
{
	public void combineS(String str1,String str2);
}
public class CombineString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st string :");
		String s1=sc.nextLine();
		
		System.out.println("Enter 2nd string :");
		String s2=sc.nextLine();
		
		Combine c=(str1,str2)->{
			
			System.out.println("After concatenation : "+str1.concat(str2));
		};
		c.combineS(s1, s2);
	}

}
