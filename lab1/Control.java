package com.lab1.test;

/******
 * Control: The "main" class to run program
 * Author: Nicole Sitenok
 * Date: 28/01/2021
******/

public class Control {

	public static void main(String[] args) {
		// Print Hello World
		System.out.println("Hello World!");
		
		//Create objects for Vehicle class
		Vehicle v1 = new Vehicle("Molly", "12-D-1234");
		Vehicle v2 = new Vehicle("Tom", "15-M-8731", 200, "Silver", "Manual", 4);
		Vehicle v3 = new Vehicle("Alex", "03-KE-2836", 180, "White", "Automatic", 2);
		
		//Print object without a method
		System.out.println(v1);
		
		//Print out all info of attributes
		System.out.println(v2);
		System.out.println(v3);
		
	}

}
