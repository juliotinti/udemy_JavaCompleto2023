package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Sec14_company;
import model.entities.Sec14_individual;
import model.entities.Sec14_taxPayer;

public class Sec14_ex2 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		List<Sec14_taxPayer> taxPayers = new ArrayList<>();
		for(int i = 1; i<=quantity; i++){
			System.out.println("Tax Payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.nextLine().charAt(0);	
			System.out.print("Name: ");
			String name = sc.nextLine();		
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();	
			sc.nextLine();
			if(type == 'i'){
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();	
				taxPayers.add(new Sec14_individual(name, anualIncome, healthExpenditures));
				sc.nextLine();
			}
			else{
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				taxPayers.add(new Sec14_company(name, anualIncome, numberOfEmployees));
				sc.nextLine();
			}
		}
		System.out.println("TAXES PAID: ");
		double taxSum = 0.0;
		for(Sec14_taxPayer _taxPayers: taxPayers)
		{
			System.out.println(_taxPayers);
			taxSum += _taxPayers.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", taxSum));
		sc.close();

	}

}
