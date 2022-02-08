package com.javaDay9;

import java.util.*;

//Create Lambda to pass string and return the length of String
interface StringLength
{
	public int length(String str);
}

public class LengthOfString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=sc.nextLine();
		
		StringLength st=(str)->
			{
				int count=0;
				for(int i=0;i<s.length();i++)
				{
					count++;
				}
			    return count;
			};
			
			System.out.println("String is : "+s);
			System.out.println("String length is : "+st.length(s));
			
	}

}
