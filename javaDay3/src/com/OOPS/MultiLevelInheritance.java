package com.OOPS;

class A1
{
	public void printA()
	{
		System.out.println("It is class A");
	}
}
class B1 extends A1
{
	public void printB()
	{
		System.out.println("It is class B");
	}
}
class C extends B1
{
	public void printC()
	{
		System.out.println("It is class C");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.printA();
		c.printB();
		c.printC();
	}

}
