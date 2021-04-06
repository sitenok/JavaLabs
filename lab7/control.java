package lab7;

public class control {

	public static void main(String[] args) 
	{
		//Instantiate object test
		date birthday = new date(10,10,2000);
		System.out.println(birthday);
		
		job j1 = new job(5, "Nurse", 100);
		System.out.println(j1);
		
		//open, read file
		fileProcessor file1 = new fileProcessor("roles.txt");
		file1.openFile();
		String lineRead = file1.readFile();
		//System.out.println("from control class: "+lineRead);
		
		employee e1 = new employee("Maria", "Good", "Female", 10005, 15, "Nurse");
		
		System.out.println("Employee 1: " +e1);
	}

}
