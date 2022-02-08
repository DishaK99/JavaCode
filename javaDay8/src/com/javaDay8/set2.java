package com.javaDay8;

import java.util.*;

public class set2 {

	public static void main(String args[])   
    {   
        Set<Integer> data = new HashSet<Integer>();   
    
        data.add(31);   
        data.add(21);   
        data.add(41);   
        System.out.println("Set: " + data);  
          
        data.clear();   
        System.out.println("The final set: " + data);   
    }   
}
