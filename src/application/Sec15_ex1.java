package application;

import java.util.Locale;
import java.util.Scanner;

import javax.security.auth.login.AccountException;

import model.entities.Sec15_account;

public class Sec15_ex1 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			Sec15_account account = new Sec15_account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();			
			account.withdraw(withdraw);
			System.out.printf("New balance: %.2f", account.getBalance());
		} 
		catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}	
		catch (RuntimeException e)
		{
			System.out.println("Unexpected error");
		}
		sc.close();
	}

}
