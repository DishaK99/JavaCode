package com.javaDay2;

class Laptop
{
	int price;
	String brand;
	
	Laptop(int price,String brand)
	{
		this.price=price;
		this.brand=brand;
	}
	public void display()
	{
		System.out.println("Price = "+price+", Brand = "+brand);
	}
}
class Person
{
	int age;
	String name;
	
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
	public void display()
	{
		System.out.println("Name = "+name+", Age = "+age);
	}
}
class Student1
{
	int rollno;
	String name;
	
	Student1(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
		
	}
	public void display()
	{
		System.out.println("Name = "+name+", RollNo = "+rollno);
	}
}
class Employee
{
	int empId,salary;
	
	Employee(int empId,int salary)
	{
		this.empId=empId;
		this.salary=salary;
		
	}
	public void display()
	{
		System.out.println("EmployeeID = "+empId+", Salary = "+salary);
	}
}

class Addition
{
	int n1,n2;
	
	Addition(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		
	}
	public void display()
	{
		System.out.println("Addition = "+(n1+n2));
	}
}

public class JavaClasses {
	public static void main(String args[])
	{
		//Laptop class
		Laptop o1=new Laptop(30000,"HP");
		o1.display();
		
		Laptop o2=new Laptop(35000,"LENOVO");
		o2.display();
		
		Laptop o3=new Laptop(37000,"DELL");
		o3.display();
		System.out.println();
		
		//Person class
		Person p1=new Person(20,"AAA");
		p1.display();
		
		Person p2=new Person(22,"BBB");
		p2.display();
		
		Person p3=new Person(25,"CCC");
		p3.display();
		System.out.println();
		
		//Student1 class
		Student1 s1=new Student1(01,"ABC");
		s1.display();
		
		Student1 s2=new Student1(02,"XYZ");
		s2.display();
		
		Student1 s3=new Student1(03,"PQR");
		s3.display();
		System.out.println();
		
		//Employee class
		Employee e1=new Employee(101,45000);
		e1.display();
		
		Employee e2=new Employee(102,50000);
		e2.display();
		
		Employee e3=new Employee(103,55000);
		e3.display();
		System.out.println();
		
		//Addition class
		Addition a1=new Addition(20,30);
		a1.display();
		
		Addition a2=new Addition(2,3);
		a2.display();
		
		Addition a3=new Addition(50,80);
		a3.display();
		
		
		
	}

}
