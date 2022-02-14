package com.javaDay10;

/*
 thread
 -part of process
 it shares the same memory of process
 -it has a life cycle
 -New : Runnable
 -Runnable: Running(Automatically)
 -Waiting : Runnable(notify, notifyAll, resume method)
 
 
 * ways to create thread
 1. Thread class
 2. Runnable Interface
 
  */

class TestThread extends Thread
{
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			// currentThread() --it will give the currently running thread
			// ALl the props using methods
			
				System.out.println("Thread class" + i + " " + currentThread().getName());
				try {
					currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
}

public class MyThread {
	public static void main(String args[]) {
		TestThread T1 = new TestThread();
		// start method is use to start the thread
		// and internally call the run method
		// setName is used to set the name of thread
		T1.setPriority(10);
		T1.setName("T1");
		
		T1.start();
        
		TestThread T2 = new TestThread();
		T2.setName("T2");
		
		T2.start();
		 
	}

}
