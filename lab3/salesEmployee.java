package com.lab3;

public class salesEmployee extends Employee
{
	//Attributes
	private double commissionEarned;
	
	//Constructor
	public salesEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned)
	{
		super(firstName, surName, staffNumber, annualSalary);
		setCommissionEarned(commissionEarned);
	}

	public double getCommissionEarned()
	{
		return commissionEarned;
	}

	public void setCommissionEarned(double commissionEarned) 
	{
		this.commissionEarned = commissionEarned;
	}
	
	public double netPay()
	{
		double netPay = this.commissionEarned + (getAnnualSalary()/12);
		return netPay;
	}
	
}
