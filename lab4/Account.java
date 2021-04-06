package lab4;
import java.util.Scanner;

public class Account implements validateAccount
{
	//attributes
	private String accountName;
	private int accountNumber;
	private boolean inCredit;
	private double acctBalance;
	private static int currentNumber; 
	
	//constructors
	public Account(String accountName, int accountNumber, boolean inCredit, double acctBalance, int currentNumber)
	{
		setAccountName(accountName);
		setAccountNumber(accountNumber);
		setInCredit(inCredit);
		setAcctBalance(acctBalance);
		setCurrentNumber(currentNumber++);
	}
	
	public Account(String accountName, int accountNumber, boolean inCredit, double acctBalance)
	{
		setAccountName(accountName);
		setAccountNumber(accountNumber);
		setInCredit(inCredit);
		setAcctBalance(acctBalance);
	}
	
	//methods (getters and setters)
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public boolean isInCredit() {
		return inCredit;
	}
	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}
	public double getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}
	
	public static int getCurrentNumber() 
	{
		return currentNumber;
	}

	public static void setCurrentNumber(int currentNumber) 
	{
		Account.currentNumber = currentNumber;
	}

	//object for scanning user input
	Scanner input = new Scanner(System.in);
	
	//method to deposit a sum(inputed) into account
	public void deposit(double depositMoney)
	{
		depositMoney=0;
		System.out.print("Please enter deposit amount: ");
		depositMoney = input.nextDouble();
		this.acctBalance = this.acctBalance + depositMoney;
		System.out.println("Your account balance is: "+this.acctBalance);
	}
	
	//method to withdraw a sum(inputed) from account
	public void withdraw(double withdrawMoney)
	{
		withdrawMoney=0;
		System.out.print("Please enter withdrawal amount: ");
		withdrawMoney = input.nextDouble();
		this.acctBalance = this.acctBalance - withdrawMoney;
		System.out.println("Your account balance is: "+this.acctBalance);
	}

	@Override
	public void getDetails() 
	{
		System.out.println("USING I/F The account name is: "+this.accountName);
		System.out.println("USING I/F The account balance is: "+this.acctBalance);
	}

	@Override
	public void valuableAccount() 
	{
		System.out.println("USING I/F The account balance is: "+this.acctBalance);
	}
}

