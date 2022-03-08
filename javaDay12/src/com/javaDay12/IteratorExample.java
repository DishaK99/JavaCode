package com.javaDay12;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
		

	}

}
