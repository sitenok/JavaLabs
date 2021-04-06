package com.lab3;

/* Lab 3 Part 1
 * Date:11/02/2021
 */

public class Employee 
{
	//Attributes
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
	
	//Constructors
	public Employee(String firstName, String surName, int staffNumber, double annualSalary)
	{
		setFirstName(firstName);
		setSurName(surName);
		setStaffNumber(staffNumber);
		setAnnualSalary(annualSalary);
	}
	
	//construct for hourly employee - without annual salary
	public Employee(String firstName, String surName, int staffNumber)
	{
		setFirstName(firstName);
		setSurName(surName);
		setStaffNumber(staffNumber);
	}
	
	//Setters and Getters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public int getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	//method to calculate the monthly pay of an employee
	public double calculatePay()
	{
		double monthlyPay = this.annualSalary/12;
		//System.out.println("\nMonthly pay: ");
		return monthlyPay;
	}
	
	//Print out attributes
	public String toString()
	{
		String output;
		return output = ("\nEmployee name: "+firstName+"\nEmployee surname: "+surName+"\nEmployee number: "+staffNumber+"\nAnnual salary: "+annualSalary);
	}
	
}
