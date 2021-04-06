package lab7;

public class date 
{
	//attributes
	private int day;
	private int month;
	private int year;
	
	//constructor
	public date(int day, int month, int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	//method to print out attributes
	public String toString()
	{
		String output;
		return output = ("DATE: "+day+"/"+month+"/"+year);
	}
	
	//getters and setters
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
