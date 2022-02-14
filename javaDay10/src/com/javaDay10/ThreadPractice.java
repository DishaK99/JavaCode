package com.javaDay10;

class RunnableClass implements Runnable
{
	public void run()
	{
		//isAlive()- checks that thread is still alive or not
		System.out.println(Thread.currentThread().isAlive());
		
		//getPriority()- return thread's priority
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i <3; i++) {
		System.out.println("Thread :"+Thread.currentThread().getName());
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return current active threads
		System.out.println(Thread.activeCount());
		
		//System.out.println(Thread.interrupted());
		
		
	}
		
	}
}

public class ThreadPractice {
	public static void main(String args[])
	{
		RunnableClass t1=new RunnableClass();
		Thread t2=new Thread(t1);
		t2.setName("Thread 1");
		t2.start();
		
		RunnableClass t3=new RunnableClass();
		Thread t4=new Thread(t1);
		t4.setName("Thread 2");
		t4.start();
		
		RunnableClass t5=new RunnableClass();
		Thread t6=new Thread(t1);
		t6.setName("Thread 3");
		t6.start();
		
		System.out.println(t6.getPriority());
		
		
	}

}
