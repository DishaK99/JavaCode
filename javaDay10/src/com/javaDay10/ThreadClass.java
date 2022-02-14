package com.javaDay10;

class ThreadExample extends Thread
{
	public void run()
	{
		System.out.println("Thread is started");
	}
}

public class ThreadClass {
	public static void main(String args[])
	{
		ThreadExample t1=new ThreadExample();
		t1.start();
		
	}

}
