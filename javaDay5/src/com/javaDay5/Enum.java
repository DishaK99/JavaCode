package com.javaDay5;

//enum-used to declare list of constatnts value in java


enum Color1
{
	RED,GREEN,BLUE
}

public class Enum {
	private final static String SUNDAY="Sunday";

	public static void main(String args[])
	{
		
		System.out.println(Color1.valueOf("RED"));
		System.out.println(Color1.GREEN);
		Color1[]c = Color1.values();
		for(Color1 d:c)
		{
			System.out.println(d.name());
		}
		
	}

}
