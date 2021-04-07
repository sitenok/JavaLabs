package lab8;

import java.util.ArrayList;

public class Control {

	public static void main(String[] args) 
	{
		int count=0;
		
		Person p1 = new Person ("John", "Green", "Toronto");
		System.out.println(p1);
		Person p2 = new Person ("Marie", "Canning", "Dublin");
		System.out.println(p2);
		Person p3 = new Person ("Pablo", "Grant", "Milan");
		System.out.println(p3);
		Person pep = new Person();
		
		//ArrayList<Person> people = new ArrayList<Person>();
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		System.out.println("ArrayList length: "+people.size());
		
		//loop through array to print objects
		for(count=0; count<people.size(); count++)
		{
			pep = people.get(count);
			System.out.println(pep.toString());
		}
		
		//making a copy of array list
		ArrayList secondList = people;
		
		//GUI of Array
		ArrayGui gui = new ArrayGui(null);
		
	}

}
