package com.javaDay4;

class A{
	A()
	{
		System.out.println("A class constructor");
	}
}
class B extends A {
	B()
	{
		//super() must be the first line of child class constructor
		super();
		System.out.println("B class constructor");
	}
}

public class SuperKeyword {
	public static void main(String args[])
	{
		B b=new B();
		
	}

}
