package com.javaDay6;


interface A
{
	//interface also can have member variable
	//which class implement the abstract method can access the member variable
int a=10;
public void print();	
}


class OuterClass {
	
	InnerClass innerClass=new InnerClass();
	// method of class
	public void printOuter() {
		System.out.println("Outer class");
		
		
		//create the object of this class in any local method
		
		innerClass.printInnerClass();
	}

	// inner class
	//it can be accessed with class name
	 class  InnerClass {
		public void printInnerClass() {
			System.out.println("Inner class");
		  
		}
	}



}

public class InnerClasses {
	public static void main(String args[])
	{
		//outer class object
		OuterClass outerClass=new OuterClass();
		outerClass.printOuter();
		//outerClass.print();
		//
		//InnerClass inner=new MyInnerClasses();
		
		//OuterClass.InnerClass inner=new OuterClass.InnerClass();
		//inner.printInnerClass();
		
		//Anonymous class
		//inner class 
		//because it does have any name
		A objA=new  A() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Anoymonus Inner class");
				System.out.println(a);
			}
		};
		
		objA.print();
	}

}
