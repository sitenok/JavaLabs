package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//class to read and write a file

public class fileProcessor 
{
	//attributes
	private String fileName;
	private File fileExample;
	
	//constructor
	public fileProcessor(String fileName)
	{
		setFileName(fileName);
	}

	//setter and getters
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	//methods to do things with file
	public void openFile()
	{
		fileExample = new File(fileName);
	}
	
	public String readFile()
	{
		String line = "";
		try 
		{
			Scanner scanner1 = new Scanner(fileExample);
			while(scanner1.hasNextLine())
			{
				line = scanner1.nextLine();
				System.out.println(line);
			}
			scanner1.close();
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found.");
			e.printStackTrace();
		}
		return line;
	}
	
	//check role inputed against valid roles
	public boolean roleCheck(String fileName)
	{
		try 
		{	
			File role = new File("roles.txt");
			Scanner newScanner = new Scanner(role);
			
			while(newScanner.hasNextLine())
			{
				String line = newScanner.nextLine();
				System.out.println(line.contains("Nurse"));
				
				if(line.equals(fileName))
			}
			newScanner.close();
		}
		
	}
}
