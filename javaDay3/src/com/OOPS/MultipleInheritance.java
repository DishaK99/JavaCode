package com.OOPS;

interface Parent1
{
	abstract public void printParent1();
}
class Parent2
{
	public void printParent2()
	{
		System.out.println("This is Parent 2");
	}
}
class Parent3 extends Parent2 implements Parent1
{
	public void printParent1()
	{
		System.out.println("this is Parent 1");
	}
	public void printParent3()
	{
		System.out.println("this is Parent 3");
	}
	
}

public class MultipleInheritance {
	public static void main(String args[])
	{
		Parent3 p=new Parent3();
		p.printParent1();
		p.printParent2();
		p.printParent3();
	}

}
