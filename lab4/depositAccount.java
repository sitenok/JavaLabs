package lab4;

public class depositAccount extends Account
{
	//attributes
	private double intrestRate;
	
	//constructors
	public depositAccount(String accountName, int accountNumber, boolean inCredit, double acctBalance)
	{
		super(accountName, accountNumber, inCredit, acctBalance);
		setIntrestRate(intrestRate);
	}
	
	//method to withdraw a sum(inputed) from account
	public void withdraw(double withdrawMoney)
	{
		System.out.println("You cannot withdraw from a deposit account!");
	}

	//getter and setters
	public double getIntrestRate() 
	{
		return intrestRate;
	}
	public void setIntrestRate(double intrestRate) 
	{
		this.intrestRate = intrestRate;
	}
}
