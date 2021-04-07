package lab8;

public class Person 
{
	//attributes
	private String firstName;
	private String surName;
	private String city;
	
	//constructors
	public Person(String firstName, String surName, String city)
	{
		setFirstName(firstName);
		setSurName(surName);
		setCity(city);
	}
	
	public Person()
	{
		
	}
	
	//method to print out attributes
	public String toString()
	{
		String output;
		return output = ("This person is called "+firstName+" "+surName+" and lives in the city "+city+".");
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
