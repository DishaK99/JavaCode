package com.javaDay7;

class Person<T,V,Z>
{
	private T name;
	private V id;
	private Z salary;
	
	public Person(T name,V id,Z salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	public void printPerson()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary+"\n");
		
	}
}

public class GenericClass {
	public static void main(String args[])
	{
		Person<String, Integer, Integer> p1=new Person<String, Integer, Integer>("ABC",101,50000);
		p1.printPerson();
		
		Person<Integer, Integer, Integer> p2=new Person<Integer, Integer, Integer>(333,101,50000);
		p2.printPerson();
		
		Person<Integer, Float,Double> p3=new Person<Integer, Float, Double>(333,10.1f,50000.00);
		p3.printPerson();
	}

}
