package com.lab3;

public class Control {

	public static void main(String[] args) 
	{
		//Create objects - employees
		Employee a1 = new Employee("Martha", "Breen", 123456, 30);
		Employee a2 = new Employee("Julia", "Murphy", 32492, 115);
		
		//Print objects and monthly pay
		System.out.println(a1);
		System.out.println("Monthly pay: " +a1.calculatePay());
		System.out.println(a2);
		System.out.println("Monthly pay: " +a2.calculatePay());
		
		//Create objects - hourly employees
		hourlyEmployee h1 = new hourlyEmployee("James", "Burn", 127263, 2.00, 8.00);
		
		//Print objects and hourly pay
		System.out.println(h1);
		System.out.println("Weekly pay (hours worked by hourly rate): " +h1.calculatePay());
		
		//Create objects - sales employee
		salesEmployee s1 = new salesEmployee("Marie", "King", 127263, 15000, 750);
		
		//Print objects and net pay
		System.out.println(s1);
		System.out.println("Commission Earned: " +s1.getCommissionEarned());
		System.out.println("Net pay (annual pay/12 + commission): " +s1.calculatePay());
		
	}

}
