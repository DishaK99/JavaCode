package com.javaDay7;

import java.util.*;

/*
 Collection
 - set of diff. implementation like array, stack, linked list, queue
 - easy to insert, delete, update etc.
 - it is an interface
 - 
 */

public class Collection {
	public static void main(String args[])
	{
		//creating object of ArraList
		ArrayList<Integer> list=new ArrayList<Integer>();
		//we can also convert it in generic type
		//ArrayList<String> list=new ArrayList<String>();
		list.add(543);
		list.add(33);
		list.add(1);
	    list.add(31);
	    
	    //using toString()
	    System.out.println(list);
	    
	    for(Object obj:list)
	    {
	    	System.out.println(""+obj.toString());
	    }
	
	    //to clear list
	    //list.clear();
	   // System.out.println(list);
	    
	    //contains() used to check whether the value is present or not
	    //returns result as true or false
	    System.out.println(list.contains("ABC"));
	    
	    //java 1.8 feature
	    //takes lambda expression
	    list.forEach(System.out::println);
	    
	    //takes index of a value
	    System.out.println(list.get(0));//ABC
	    
	    //returns the index value
	    //if not found, returns -1
	    System.out.println(list.indexOf("ABC"));//0
	    
	    //return try if list is empty else returns false
	    System.out.println(list.isEmpty());
	    
	    //modify all the values, used to iterate list
	    Iterator it=list.iterator();
	    //hasNext()- return true if there is any value present else return false
	    while(it.hasNext())
	    {
	    	
	    	//next()- returns the current value
	    	System.out.println("iterator "+it.next());
	    }
	    
	    //remove(value)- used to remove value
	    System.out.println(list.remove("ABC"));//return true if found or false
        
	    //size()- return the size of the list
	    System.out.println(list.size());
	    
	    System.out.println();
	    
	    //sort()- sorts an array
	    Collections.sort(list);
	   System.out.println(list);
	}

}
