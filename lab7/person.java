package lab7;

import java.util.Date;

public class person 
{
	//attributes
	private String firstName;
	private String surName;
	private Date dateOfBirth;
	private String gender;
	
	//constructors
	public person(String firstName, String surName, Date dateOfBirth, String gender)
	{
		setFirstName(firstName);
		setSurName(surName);
		setDateOfBirth(dateOfBirth);
		setGender(gender);
	}
	
	public person(String firstName, String surName, String gender)
	{
		setFirstName(firstName);
		setSurName(surName);
		setGender(gender);
	}
	
	//method to print out attributes
	public String toString()
	{
		String output;
		return output = ("Name: "+firstName+" "+surName+"\nBirthday: "+dateOfBirth+ "\nGender: "+gender);
	}

	//getters and setters
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//methods 
	
}
