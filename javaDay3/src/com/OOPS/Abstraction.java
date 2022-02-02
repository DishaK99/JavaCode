package com.OOPS;

abstract class Mobile
{
	abstract public void calling();
	
	abstract void sendSMS() ;
	public void charging()
	{
		System.out.println("USB Charging");
	}
	
}
class Google extends Mobile
{
	
	 public void calling()
	{
		System.out.println("Google 4G Calling");
		
	}
	 public void sendSMS()
	 {
		 System.out.println("Sends SMS using Internet");
		 }
	public void android()
	{
		System.out.println("Android Phone");
	}
}

public class Abstraction {
	public static void main(String args[])
	{
		Google g=new Google();
		g.android();
		g.calling();
		g.sendSMS();
	}
}
