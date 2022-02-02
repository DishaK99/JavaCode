package com.javaDay4;

class Shape
{
	public void drawShape()
	{
		System.out.println("Drawing shape");
	}
	
}
class Line extends Shape
{
	public void drawShape(int a)
	{
		System.out.println("Drawing Line");
	}
	
	
}

public class Polymorphism {
	public static void main(String args[])
	{
		Line l=new Line();
		l.drawShape();
		l.drawShape(3);
	}

}
