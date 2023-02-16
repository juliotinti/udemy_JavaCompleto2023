package model.entities;

import javax.security.auth.login.AccountException;

public class Sec15_account 
{
	private Integer number;
	private String holder;
	private Double balance; 
	private Double withdrawLimit;

	public Sec15_account() {}	

	public Sec15_account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double value)
	{
		this.balance += value;		
	}
	
	public void withdraw(double value) throws AccountException
	{
		if(withdrawLimit < value)
			throw new AccountException("The amount exceeds withdraw limit");
		if(balance < value)
			throw new AccountException("Not enough balance");
		
		this.balance -= value;				
	}

	@Override
	public String toString() 
	{
		return "Account data:\n";
	}
}
