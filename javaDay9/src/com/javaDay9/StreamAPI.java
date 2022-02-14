package com.javaDay9;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
 
 //Stream is a class in java
 
public class StreamAPI {
	public static void main(String args[]) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(-70);
		ls.add(-90);
		ls.add(20);
		
		Stream<Integer> s = ls.stream();
		
		ls.stream().forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("-----------------------------------------------------------");
		//filter
		//returns true if data needs to be considered
		//returns false if data not to be considered
		ls.stream().filter(num ->num >= 20).forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");
		
		//Collection the data and return back
				//filters the data of only positive num
				//collectors method is used to send it back
				//collect method will collect all the data and return as list
				//Collectors.toList() convers the data to list
		List<Integer> filterList = ls.stream()
		.filter(num->num>10).collect(Collectors.toList());
		filterList.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");
		
		
		
		
		System.out.println(ls.stream().count());
		System.out.println("-----------------------------------------------------------");
		
		//ls.stream().max();
		//.min();
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Max "+ls.stream().min(Collections.reverseOrder()));
		
		System.out.println("Min "+ls.stream().max(Collections.reverseOrder()));
		
	    IntSummaryStatistics state=ls.stream().mapToInt(x->x).summaryStatistics();
	    System.out.println("Count "+state.getCount());
	    System.out.println("Sum "+state.getSum());
	    System.out.println("Min "+state.getMax());
	    System.out.println("Max "+state.getMin());
	    System.out.println("Average "+state.getAverage());
}

}
