package com.OOPS;


abstract class Shape{  
	abstract void draw();  
	}  
 
	class Rectangle extends Shape{  
	void draw()
	{
		System.out.println("drawing rectangle");
		}  
	}  
	class Circle1 extends Shape{  
	void draw()
	{
		System.out.println("drawing circle");
		}  
	}  
	 
	
public class AbstractionExample {
		public static void main(String args[]){  
		Rectangle r=new Rectangle();
		r.draw();
		
		Circle1 c=new Circle1();
		c.draw();
		}  
		

}
