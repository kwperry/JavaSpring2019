import java.util.Date;

public class Account {
	private float balance;
	private float anualIntRate;
	private int accountId;
	private Date dateCreated;
	
	public float getBalance() {
		return balance;
	}
	
	public float getAnualIntRate() {
		return anualIntRate;
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	
	
	//returns the Interest per month
	//still in percent
	private float getMonthlyIntRate()
	{
		return (anualIntRate/12);
	}
	//gets the monthly interest. 
	//This is money $
	public float getMonthlyInterest()
	{
		return balance * (getMonthlyIntRate()/100);
	}
	
	//manipulates how much money is in the account
	private void accountManagement(float money)
	{
		this.balance += money;
	}
	
	//prints out the amount widthdrew, 
	//and removes the money for the account
	public void widthdraw(float money)
	{	
		System.out.println("Widthdrew: $" + money);
		accountManagement(-1 * money);
	}
	
	//prints out the amount deposited
	//and adds the money into the account
	public void deposit(float money)
	{
		System.out.println("Deposited: $" + money);
		accountManagement(money);
	}
	
	

	//prints out all the information pertaining to the account
	public void printAccountInfo()
	{
		System.out.println("Id: " + this.accountId);
		System.out.println("Creation Date: " + this.dateCreated);
		System.out.println("Balance: $" + getBalance());
		System.out.println("Monthly Interest Rate: " + this.getMonthlyIntRate() + "%");
		System.out.println("Monthly Interest: $" + this.getMonthlyInterest());
	}
	
	Account(){
		this.accountId = 0;
		this.anualIntRate = 1f;
		this.balance = 0;
		this.dateCreated = new Date();
		
	}
	
	Account(float initBal,  int id)
	{
		this.accountId = id;
		this.balance = initBal;
		this.anualIntRate = 4.5f;
		this.dateCreated = new Date();
	}
	
	
	
	
}
