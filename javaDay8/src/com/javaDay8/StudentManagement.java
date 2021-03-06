package com.javaDay8;

import java.util.*;

//Create Set with Integer element
//Create A Student class with(5 attribute)
//Create A set with Student
//Add the option
//Press 1 for insert
//Press 2 for delete
//Press 3 for Update
//Press 4 for sort ASC
//Press 5 for sort DESC
//Press 6 for print the size
//Press 7 for Exit

class Student
{
	
	int rollno;
	String firstName, lastName, school;
	public Student(int rollno, String firstName, String lastName, String school) {
		//super();
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.school = school;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "Student [RollNo=" + rollno + ", First Name=" + firstName + ", Last Name= "+lastName+", School= "+school+ "]";
	}
	
	
	
}


public class StudentManagement 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		List<Student> s=new ArrayList<Student>();
		
		while (true) {
			System.out.println("Enter 1 for insert");
			System.out.println("Enter 2 for delete");
			System.out.println("Enter 3 for update");
			System.out.println("Enter 4 for sort ase");
			System.out.println("Enter 5 Sort desc");
			System.out.println("enter 6 for print the size");
			System.out.println("Enter 7 for exit");
			int choice = sc.nextInt();
			if(choice == 1) {				
				System.out.println("Enter the Number of Students you want to enter");
				int size = sc.nextInt();
				for(int i=0;i<size;i++)
				{
					
				
					System.out.println("Enter Roll No: ");
					int roll= sc.nextInt();
					System.out.println("Enter First Name: ");
					String fname = sc.next();
					System.out.println("Enter Last Name: ");
					String lname = sc.next();
					System.out.println("Enter School Name: ");
					String school = sc.next();
					s.add(new Student(roll,fname,lname,school));
					
				}
				 Iterator<Student> it = s.iterator();
				 
			        while (it.hasNext())
			        {
			            Student student = (Student) it.next();
			 
			            System.out.println(student);
			        }
			}
			else if(choice==2)
			{
				boolean found=false;
				System.out.println("enter roll no to delete :");
				int rollno=sc.nextInt();
				Iterator<Student> i=s.iterator();
				while(i.hasNext())
				{
					Student s1=i.next();
					if(s1.getRollno()==rollno)					
					{
						i.remove();
						found=true;						
					}
				}
				if(!found)
				{
					System.out.println("Record not found");
				}
				else
				{
					System.out.println("Record is deleted successfully");
				}
				
			}
			else if(choice==3)
			{
				boolean found=false;
				System.out.println("enter roll no to update :");
				int rollno=sc.nextInt();
				ListIterator<Student> li=s.listIterator();
				while(li.hasNext())
				{
					Student s1=li.next();
					if(s1.getRollno()==rollno)					
					{
						System.out.println("enter new  first name : ");
						String firstname=sc.nextLine();
						
						System.out.println("enter new last name : ");
						String lastname=sc.nextLine();
						
						System.out.println("enter new school name : ");
						String sname=sc.nextLine();
						
						li.set(new Student(rollno,firstname,lastname,sname));
						
						found=true;						
					}
				}
				if(!found)
				{
					System.out.println("Record not found");
				}
				else
				{
					System.out.println("Record is updated successfully");
					Iterator<Student> it = s.iterator();
					 
			        while (it.hasNext())
			        {
			            Student student = (Student) it.next();
			 
			            System.out.println(student);
			        }
				}
				
			}
			else if(choice==4)
			{
								
			}
			else if(choice==5)
			{
				
			}
			else if(choice==6)
			{
				System.out.println("Size = "+s.size());
			}
			else if(choice==7)
			{
				System.out.println("Exit");
				break;
			}
			else
			{
				System.out.println("Enter number between 1 to 7 :");
			}
		}
		
	}

	

}
