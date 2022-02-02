package com.javaDay2;


class Phone
{
	private int price;
	private String brand;
	private String color;
	private int storage;
	private float screenSize;
	
	Phone()
	{
		
	}
	
	Phone(int price, String brand, String color, int storage, float screenSize)
	{
		this.price=price;
		this.brand=brand;
		this.color=color;
		this.storage=storage;
		this.screenSize=screenSize;
	}
	
	public void print()
	{
		System.out.println("Price = "+price+", brand = "+brand+", color = "+color+", storage = "+storage+", screenSize = "+screenSize);
	}
}


public class MyClass {
	public static void main(String args[])
	{
		Phone nokia=new Phone(11000,"nokia","white",64,6.1f);
		nokia.print();
		
	}

}
