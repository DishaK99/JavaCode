package com.javaDay7;

import java.util.*;


public class ArrayList4 {
	public static void main(String args[])
	{
		ArrayList<Integer>
        arrlist = new ArrayList<Integer>();

    
    arrlist.add(1);
    arrlist.add(2);
    arrlist.add(3);
    arrlist.add(4);
    arrlist.add(5);

    
    System.out.println("Before : "+ arrlist);
    arrlist.set(3, 30);
    System.out.println("After : " + arrlist);
    
}


}
