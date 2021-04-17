package lab9;

public class Control {

	public static void main(String[] args) 
	{
		TestHashSet h1 = new TestHashSet();
		h1.printSet();
		System.out.println("\nADD");
		h1.addEntry("Vatican City");
		h1.printSet();
		h1.matchEntry("Russia");
		System.out.println("\nSORTED");
		h1.sortSet();
		
		System.out.println("\nREVERSED");
		h1.reverse();
		System.out.println("\nSHUFFLED");
		h1.shuffle();
		
		h1.clearSet();
		h1.printSet();
		
	}

}
