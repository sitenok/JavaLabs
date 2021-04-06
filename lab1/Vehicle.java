/*
 * Vehicle: Class which represents a vehicle
 * Author:Nicole Sitenok
 * Date: 28/01/2021
 * Owner name, registration number, maximum speed, colour, automatic (or not), number of wheels.
 */

package com.lab1.test;

public class Vehicle 
{
	
	//ATTRIBUTES
	private String ownerName;
	private String regNumber;
	private int    maxSpeed;
	private String colour;
	private String trasmission;
	private int    numOfWheels;
	
	private boolean recentCar;
	
	//CONSTRUCTORS
	//constructor 1
	public Vehicle(String ownerName, String regNumber)
	{
		this.ownerName = ownerName;
		this.regNumber = regNumber;
	}
	
	//constructor 2
	public Vehicle(String ownerName, String regNumber, int maxSpeed, String colour, String trasmission, int numOfWheels)
	{
		this.ownerName = ownerName;
		this.regNumber = regNumber;
		this.maxSpeed = maxSpeed;
		this.colour = colour;
		this.trasmission = trasmission;
		this.numOfWheels = numOfWheels;
	}
	
	//METHODS
	
	//Print out attributes
	public String toString()
	{
		String output;
		return output = ("The owner of this vehicle is: " +ownerName+ ", with the reg number: " +regNumber+ ".\nVehicle has max speed of: "
						+maxSpeed+ ", colour is " +colour+ ", has " +trasmission+ " trasmission and " +numOfWheels+ " wheels.\n\n");
		
	}
	
	
}//end class Vehicle
