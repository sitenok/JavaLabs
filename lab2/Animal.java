/*  PART 1 of Lab 2
 * 
 * a. module: java.desktop, package: javax.swing
 * 
 * b. The JButton class is an implementation of a push button, can be configured & controlled.
 * 
 * c. 5 constructors
 * 
 * 
 * 1. module: java.base, package: java.util
 * 
 * 2. 3 constructors
 * 
 * 3. "clear" method empties all the elements of the list
 */

package com.lab2.animal;

/* Class which holds attributes of animals - name, breed, domestic animal
 * constructor1 to set up the name and c2 to set up all attributes
 * Methods to print.
 * 
 * Author: Nicole
 * Date: 04/02/2021
 */

public class Animal 
{
	//ATTRIBUTES
	private String name;
	private String breed;
	private boolean domesticAnimal;
	
	//CONSTRUCTORS
	//Set the name
	public Animal(String name)
	{
		this.name = name;
	}
	
	//Set the name, breed and if the animal is domestic or not
	public Animal(String name, String breed, boolean domesticAnimal)
	{
		setName(name);
		setBreed(breed);
		setDomesticAnimal(domesticAnimal);
	}
	
	//METHODS
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public void setDomesticAnimal(boolean domesticAnimal)
	{
		this.domesticAnimal = domesticAnimal;
	}
	
	//getters
	public String getName()
	{
		return this.name;
	}
	
	//Print out attributes
	public String toString()
	{
		String output;
		return output = ("The animal is called: " +name+ ", is a " +breed+ " and it is "+domesticAnimal+" that is is a domestic animal.");
	}
	
	//Prints out which noise and animal makes
	public void makeNoise()
	{
		if(breed == "dog")
		{
			System.out.println("Dogs say Woof!");
		}
		if(breed == "tiger")
		{
			System.out.println("A tiger says Roar!");
		}
		else
		{
			System.out.println("The sound this animal makes is unknown.");
		}
		
	}//end makeNoise
		
}//end Animal
