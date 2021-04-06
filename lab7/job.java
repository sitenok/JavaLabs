package lab7;

import java.io.File;

public class job
{
	//attributes
	private double salary;
	private String role;
	private int jobId;
	
	//constructor
	public job(double salary, String role, int jobId)
	{
		setSalary(salary);
		setJobId(jobId);
		setRole(role);
	}
	
	//method to print out attributes
	public String toString()
	{
		String output;
		return output = ("Salary: "+salary+",\nRole: "+role+",\nJob ID: "+jobId);
	}
	
	//getters and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	
}
