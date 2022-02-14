package com.javaDay9;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.*;


public class StreamPractice2 {
	public static void main(String args[]) {
		
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		

		IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
		
	      System.out.println("Highest number in List : " + stats.getMax());
	      System.out.println("Lowest number in List : " + stats.getMin());
	      System.out.println("Sum of all numbers : " + stats.getSum());
	      System.out.println("Average of all numbers : " + stats.getAverage());
	      
	      
	      String[] arr= new String[] { "a", "b", "c" };

	      Stream<String> streamOfStrings = Arrays.stream(arr);
	      for(int i=0;i<arr.length;i++)
	      {
	      System.out.println(arr[i]);
	      }
	     

}
}
