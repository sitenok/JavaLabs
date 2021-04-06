package lab7;

import java.util.Date;

public class employee extends person
{
	//attributes
	private int personnelNumber;
	private Date startDate;
	private int nextNumber;
	private String job;
	
	//constructor
	public employee(String firstName, String surName, Date dateOfBirth, String gender, int personnelNumber, Date startDate, int nextNumber, String job)
	{
		super(firstName, surName, dateOfBirth, gender);
		setPersonnelNumber(personnelNumber);
		setStartDate(startDate);
		setNextNumber(nextNumber);
		setJob(job);
	}
	
	//constructor
	public employee(String firstName, String surName, String gender, int personnelNumber, int nextNumber, String job)
	{
		super(firstName, surName, gender);
		setPersonnelNumber(personnelNumber);
		setNextNumber(nextNumber);
		setJob(job);
	}
	
	//method to print out attributes
	public String toString()
	{
		String output;
		return output = (Personnel Number: "+personnelNumber+", next number: "+nextNumber+", Job:"+job);
	}
	
	//getters and setters
	public int getPersonnelNumber() {
		return personnelNumber;
	}
	public void setPersonnelNumber(int personnelNumber) {
		this.personnelNumber = personnelNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getNextNumber() {
		return nextNumber;
	}
	public void setNextNumber(int nextNumber) {
		this.nextNumber = nextNumber;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
