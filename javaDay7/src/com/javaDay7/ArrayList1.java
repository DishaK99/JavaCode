package com.javaDay7;

import java.util.*;

public class ArrayList1 {
	public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>();  
		  list.add("Abc");   
		  list.add("Xyz");    
		  list.add("Pqr");    
		  list.add("Aaa");    
		  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

}
