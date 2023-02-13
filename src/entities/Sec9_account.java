package entities;

public class Sec9_account 
{
	private int number;
	private String name; 
	private double totalValue;

	public Sec9_account(int number, String name, double initialDeposit) 
	{
		this.number = number;
		this.name = name;
		Deposit(initialDeposit);
	}
	
	public Sec9_account(int number, String name) 
	{
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() 
	{
		return number;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getTotalValue() 
	{
		return totalValue;
	}

	public void Deposit(double value)
	{
		this.totalValue += value;		
	}
	
	public void Withdraw(double value)
	{
		this.totalValue -= (value+5);				
	}

	@Override
	public String toString() 
	{
		return "Account data:\n" + 
			   "Account " + number + 
			   ", Holder: " + name +
			   ", Balance: " + 
			   String.format("$ %.2f",totalValue);
	}
	
	
	
}
