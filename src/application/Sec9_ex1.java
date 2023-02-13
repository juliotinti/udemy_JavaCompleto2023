package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Sec9_account;

public class Sec9_ex1 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Sec9_account account;
		int accountNumber;
		String name;
		char isInitialDeposit;
		double accountValue; 
		
		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();
		sc.nextLine(); //limpar buffer
		
		System.out.print("\nEnter account holder: ");
		name = sc.nextLine();
		
		System.out.print("\nIs there an initial deposit (y/n): ");
		isInitialDeposit = sc.nextLine().charAt(0);
		
		if(isInitialDeposit == 'y')
		{
			System.out.printf("\nEnter initial deposit value: ");
			accountValue = sc.nextDouble();
			account = new Sec9_account(accountNumber, name, accountValue);
		}
		else
			account = new Sec9_account(accountNumber, name);

		System.out.printf("\n%s\n", account);
		
		System.out.print("\nEnter a deposit value: ");
		double newValue = sc.nextDouble();
		account.Deposit(newValue);
		System.out.printf("\nUpdated %s\n", account);
		
		System.out.print("\nEnter a withdraw value: ");
		double newWithdraw = sc.nextDouble();
		account.Withdraw(newWithdraw);
		System.out.printf("\nUpdated %s\n", account);
		
		sc.close();
	}

}
