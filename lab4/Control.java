package lab4;

public class Control {

	public static void main(String[] args) 
	{
		Account a1 = new Account("Marthas account", 123456, false, 1000);
		
		//check depositing method
		System.out.println(a1.getAccountName());
		
		a1.deposit(0);
		System.out.println(a1);
		System.out.println(a1.getCurrentNumber());
		
		//check withdraw method
		a1.withdraw(0);
		System.out.println(a1);
		
		
		depositAccount d1 = new depositAccount("Jimmys deposit account", 23456, false, 1000);
		//System.out.println(d1.getAccountName());
		
		d1.withdraw(0);
		d1.valuableAccount();
		System.out.println(d1.getCurrentNumber());
		
		
		currentAccount c1 = new currentAccount("Beckys current account", 45678, true, 100);
		System.out.println(c1.getAccountName());
		
		c1.deposit(0);
		c1.withdraw(0);
		c1.getDetails();
		System.out.println(c1.getCurrentNumber());
	}

}
