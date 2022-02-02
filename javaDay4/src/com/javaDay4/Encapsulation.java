package com.javaDay4;


/*
  Encapsulation
  --Data Hiding
  --Variables should be private
  --Methods should be public
*/

class Employee
{
	private int empID;
	private String name;
	private float salary;
	
	public Employee(int empID, String name, float salary) {
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class Encapsulation {

	public static void main(String args[] )
	
	{
		Employee employee=new Employee(1001, "ABC", 55000);
		System.out.println("Employee Id : "+employee.getEmpID());
		
		System.out.println("Employee Name : "+employee.getName());
		
		System.out.println("Employee Salary : "+employee.getSalary());
	}
}
