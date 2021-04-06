package lab4;

public class currentAccount extends Account
{
	//attributes
	private double penaltyAmount;
	private String warningMessage= ("Warning! Your account is in credit of more than 100 euro!");
	
	//constructor
	public currentAccount(String accountName, int accountNumber, boolean inCredit, double acctBalance)
	{
		super(accountName, accountNumber, inCredit, acctBalance);
		setPenaltyAmount(penaltyAmount);
	}
	
	//getter setter methods
	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	
	public String getWarningMessage() {
		return warningMessage;
	}

	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}
	
	//method to withdraw and add 10 to penalty amount
	public void withdraw(double withdrawMoney)
	{
		withdrawMoney=0;
		System.out.print("Please enter withdrawal amount: ");
		withdrawMoney = input.nextDouble();
		setAcctBalance(getAcctBalance() - withdrawMoney);
		System.out.println("Your account balance is: "+this.getAcctBalance());
		this.penaltyAmount = this.penaltyAmount + 10;
		System.out.println("Your account penalty is: "+this.penaltyAmount);
	}
	
	//method to check credit
	public void checkCredit()
	{
		if( this.getAcctBalance() > 0 )
		{
			System.out.println("Your account is not in credit.");
		}
		else 
		{
			System.out.println("Your account is in credit.");
		}
	}

	//check credit with message
	public void checkCredit(String warningMessage)
	{
		if( this.getAcctBalance() > 0 )
		{
			System.out.println(warningMessage);
		}
	}
	
}
