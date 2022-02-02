package com.OOPS;

class Parent
{
	public void printParent()
	{
		System.out.println("It is Parent class");
	}
}
class Child1 extends Parent
{
	public void printChild1()
	{
		System.out.println("It is Child1 class");
	}
}
class Child2 extends Parent
{
	public void printChild2()
	{
		System.out.println("It is Child2 class");
	}
}

public class HierarchicalInheritance {
	public static void main(String args[])
	{
		Child1 c1=new Child1();
		c1.printParent();
		c1.printChild1();
		
		System.out.println();
		
		Child2 c2=new Child2();
		c2.printParent();
		c2.printChild2();
		
	}

}
