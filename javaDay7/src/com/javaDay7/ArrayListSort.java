package com.javaDay7;

import java.util.*;

public class ArrayListSort {
	public static void main(String args[])
	{
		 List<Integer> list2=new ArrayList<Integer>();  
		  list2.add(21);  
		  list2.add(11);  
		  list2.add(51);  
		  list2.add(1);  
		  
		  System.out.println(list2);
		  
		  //Sorting the list  
		  Collections.sort(list2);  
		   
		  for(Integer number:list2)  
		    System.out.println(number);  
	}

}
