package com.javaDay8;
import java.util.*;

/*
 map
 -can store in key value form
 -duplicates not allowed
 */

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		//Adding values
		map.put(101,"Disha");
		map.put(103,"Namrata");
		map.put(104,"Abc");
		map.put(105,"Xyz");
		map.put(105,"X");//duplicate not allowed keys
		
	    System.out.println(map);
	    
	    System.out.println(map.get(103));
	    
	    Set<Integer> keys=map.keySet();
	    for(Integer key:keys)
	    {
	    	System.out.println("key "+key+" value "+map.get(key));
	    }
		
	    Map<String,Integer> map1=new HashMap<String,Integer>();
	    map1.put("Disha",101);
		map1.put("Namrata",103);
		map1.put("Abc",104);
		map1.put("Xyz",105);
		 System.out.println(map1);
		 
		 Map<Integer,Employee> map2=new HashMap<Integer,Employee>();
		 map2.put(1000, new Employee(101,"abc",50000));
		 System.out.println(map2);
		 
		 
		 
	}

}
