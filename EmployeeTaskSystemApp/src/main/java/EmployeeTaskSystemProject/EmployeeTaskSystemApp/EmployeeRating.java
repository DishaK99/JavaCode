package EmployeeTaskSystemProject.EmployeeTaskSystemApp;

public class EmployeeRating {
	private Task task;
	private Rating rating;
	
	public EmployeeRating()
	{
		
	}

	public EmployeeRating(Task task, Rating rating) {
		super();
		this.task = task;
		this.rating = rating;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	

}
