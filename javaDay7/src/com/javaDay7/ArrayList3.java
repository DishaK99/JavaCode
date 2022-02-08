package com.javaDay7;

import java.util.*;

public class ArrayList3 extends ArrayList { 
		public static void main(String[] args)
	    {
	 
	        ArrayList3 arr = new ArrayList3();
	 
	        arr.add(1);
	        arr.add(2);
	        arr.add(3);
	 
	        arr.removeRange(1, 2); 
	 
	        System.out.println("The list after using removeRange:" + arr);
	    }

}
