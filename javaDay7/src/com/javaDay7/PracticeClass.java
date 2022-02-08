package com.javaDay7;

import java.util.*;

class Employee1
{
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee1(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
class Student
{
	private int rollno;
	private String SchlName;
	private String name;
	public Student(int rollno, String schlName, String name) {
		
		this.rollno = rollno;
		SchlName = schlName;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSchlName() {
		return SchlName;
	}
	public void setSchlName(String schlName) {
		SchlName = schlName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
class Add
{
	int a;
	int b;
	int sum;
	public Add(int a, int b, int sum) {
		
		this.a = a;
		this.b = b;
		this.sum = sum;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
class Languages
{
	String a,b,c;

	public Languages(String a, String b, String c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}
	
	
}

public class PracticeClass {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Employee1 emp=new Employee1(101,"ABC",50000);
		System.out.println("Class Employee1");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

		Student s=new Student(101,"ABC","XYZ");
		System.out.println("\nClass Student");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getSchlName());
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
	}

}
