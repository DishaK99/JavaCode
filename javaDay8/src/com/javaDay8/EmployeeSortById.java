package com.javaDay8;

import java.util.*;



 class Employee1
 {
  public Employee1(int id, String name, float salary) {
 		super();
 		this.id = id;
 		this.name = name;
 		this.salary = salary;
 	}
  @Override
 	public String toString() {
 		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
 	}
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
 	public float getSalary() {
 		return salary;
 	}
 	public void setSalary(float salary) {
 		this.salary = salary;
 	}
 private int id;
  private String name;
  private float salary;
 	
 }
 
public class EmployeeSortById implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		// TODO Auto-generated method stub
		if(e1.getId()>e2.getId())
		{
		return 1;
		
		}
		else if(e1.getId() <e2.getId())
		{
		 return -1;
		 
		}
		else
		{
		return 0;	
		}
		
		//return 0;
	}


}
