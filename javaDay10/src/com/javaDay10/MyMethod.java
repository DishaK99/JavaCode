package com.javaDay10;

//default and static methods in java 1.8

interface TestInterface
{
	public void test();
	
	//now we can also add not abstract methods in interface
	/*
	 Default methods 
	 -non abstract methods
	 -add default keyword
	 */
	default public void show() {
		System.out.println("Default Method");
	}
	
	/*
	 Static method
	 -use static keyword
	 -non-abstract method
	 */
	public static void print() {
		System.out.println("Static Method");
	}
}
class TestClass implements TestInterface
{
	public void test()
	{
		System.out.println("Abstract method");
	}
}

public class MyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass testClass=new TestClass();
		testClass.test();
		testClass.show();
		
		TestInterface.print();

	}

}
