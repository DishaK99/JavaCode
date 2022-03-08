package EmployeeTaskSystemProject.EmployeeTaskSystemApp;

import java.util.List;

public class Employee {
	
	private int employeeID;
	private String employeeName;
	private String department;
	private String designation;
	private String password;
	private Employee superior;
	private List<Task> taskList;
	private List<Attendance> attendanceList;
	private Rating employeeRating;
	
	public Employee()
	{
		
	}

	public Employee(int employeeID, String employeeName, String department, String designation, String password,
			Employee superior, List<Task> taskList, List<Attendance> attendanceList, Rating employeeRating) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.department = department;
		this.designation = designation;
		this.password = password;
		this.superior = superior;
		this.taskList = taskList;
		this.attendanceList = attendanceList;
		this.employeeRating = employeeRating;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getSuperior() {
		return superior;
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public List<Attendance> getAttendanceList() {
		return attendanceList;
	}

	public void setAttendanceList(List<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}

	public Rating getEmployeeRating() {
		return employeeRating;
	}

	public void setEmployeeRating(Rating employeeRating) {
		this.employeeRating = employeeRating;
	}
	

}
