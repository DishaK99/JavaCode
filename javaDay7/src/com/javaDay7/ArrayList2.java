package com.javaDay7;

import java.util.*;

public class ArrayList2 {
	 public static void main(String[] args)
	    {
	        
	        int n = 5;
	 
	       
	        ArrayList<Integer> arrli
	            = new ArrayList<Integer>(n);
	 
	        for (int i = 1; i <= n; i++)
	            arrli.add(i);
	 
	   
	        System.out.println(arrli);
	 
	        // Remove element at index 3
	        arrli.remove(3);
	 
	       
	        System.out.println(arrli);
	 
	       
	        for (int i = 0; i < arrli.size(); i++)
	            System.out.print(arrli.get(i) + " ");
	    }

}
