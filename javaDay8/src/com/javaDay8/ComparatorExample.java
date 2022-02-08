package com.javaDay8;

import java.util.*;

public class ComparatorExample
{
	public static void main(String[] args) {
		List<Employee1> ls = new ArrayList<Employee1>();
		ls.add(new Employee1(10, "Ansar", 101.0f));
		ls.add(new Employee1(1, "Priya", 50.0f));
		ls.add(new Employee1(2, "Kumar", 10.0f));
		ls.add(new Employee1(100, "Anil", 5.0f));
		ls.add(new Employee1(5, "Zee", 60.0f));
		
		Collections.sort(ls, new EmployeeSortById());
		
		ls.forEach(System.out::println);
	}
	
}