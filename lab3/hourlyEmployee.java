package com.lab3;

public class hourlyEmployee extends Employee
{
	//Attributes
	private double hoursWorked;
	private double hourlyRate;
	
	public hourlyEmployee(String firstName, String surName, int staffNumber, double hoursWorked, double hourlyRate)
	{
		super(firstName, surName, staffNumber);
		setHoursWorked(hoursWorked);
		setHourlyRate(hourlyRate);	
	}

	public double getHoursWorked() 
	{
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) 
	{
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() 
	{
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) 
	{
		this.hourlyRate = hourlyRate;
	}
	
	//Overriding method to calculate hourly pay
	public double calculatePay()
	{
		double pay = this.hoursWorked * this.hourlyRate;
		return pay;
	}
	
}
