package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class TestHashSet 
{
	//Initialise array and hash set
	String[] countries = {"Albania", "Andora", "Belarus", "Bulgaria", "Germany", "England", "Ireland", "Iceland", "Poland", "Spain", "Russia", "Switzerland", "Romania", "Italy"};
	Set<String> europe = new HashSet<String>();
	
	//constructor
	public TestHashSet()
	{
		europe.addAll(Arrays.asList(countries));
		
	}
	
	//methods
	public void printSet()
	{
		Iterator<String> iterator = europe.iterator();
		if(europe.isEmpty())
		{
			System.out.println("\nEMPTY");
		}
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void addEntry(String country)
	{
		europe.add(country);
	}
	
	public void matchEntry(String country)
	{
		Iterator<String> iterator = europe.iterator();
		if(europe.contains(country))
		{
			System.out.println("\nTrue");
		}
		else
		{
			System.out.println("\nFalse");
		}
	}
	
	public void clearSet()
	{
		europe.clear();
	}
	
	public void sortSet()
	{
		ArrayList<String> tempArray = new ArrayList<String>(europe);
		Collections.sort(tempArray);
		//print sorted contents
		Iterator<String> iterator = tempArray.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	
	}
	
	public void reverse()
	{
		ArrayList<String> tempArray = new ArrayList<String>(europe);
		Collections.reverse(tempArray);
		
		Iterator<String> iterator = tempArray.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void shuffle()
	{
		ArrayList<String> tempArray = new ArrayList<String>(europe);
		Collections.shuffle(tempArray);
		
		Iterator<String> iterator = tempArray.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
