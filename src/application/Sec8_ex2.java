package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Sec8_employee;

public class Sec8_ex2 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Sec8_employee employee = new Sec8_employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("\nGross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("\nTax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: %s, $ %.2f\n", employee.name, employee.NetSalary());
		
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.printf("\nEmployee: %s, $ %.2f\n", employee.name, employee.NetSalary());
		sc.close();
	}

}
