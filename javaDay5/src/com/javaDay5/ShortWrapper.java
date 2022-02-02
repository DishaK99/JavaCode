package com.javaDay5;

public class ShortWrapper {
	public static void main(String args[])
	{
		//Method parseShort(), takes a string value and parse it to primitive short value
		Short b = Short.parseShort("25");
		System.out.println("Primitive short value in b : "+ b);
		System.out.println("");
		
		Short s2 = new Short("30"); 
		Short s1 = new Short("40"); 

		System.out.println("Value in s1 = "+ s1);
		System.out.println("Value in s2 = "+ s2);
        //Method compareTo() takes a Short class type object
		System.out.println("Invoking s1 to compare with s2 : "+ s1.compareTo(s2));
				
	}

}
