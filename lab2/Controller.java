/*
 * Control class for Animal.java
 * The "main" class to run program
 * Author: Nicole
 * Date: 04/02/2021
*/


package com.lab2.animal;

public class Controller {

	public static void main(String[] args) 
	{
		//Create objects using the Animal class
		Animal a1 = new Animal("Spot", "dog", true);
		Animal a2 = new Animal("Leo", "turtle", true);
		Animal a3 = new Animal("Stripey", "tiger", false);
		
		//Change name of object a1, using method
		a1.setName("Lucky");
		a1.getName();
		
		//Print the objects 
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a1.makeNoise();
		a2.makeNoise();
		a3.makeNoise();
	}

}
