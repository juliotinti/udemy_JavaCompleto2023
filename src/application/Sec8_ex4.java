package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Sec8_currencyConverter;

public class Sec8_ex4 {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price: ");
		double dollarPrice = sc.nextDouble();
		System.out.print("\nHow many dollars will be bought: ");
		double quantity = sc.nextDouble();
		System.out.printf("\nAmount to be paid in reais = R$%.2f \n", Sec8_currencyConverter.ConvertedValue(dollarPrice, quantity));
		sc.close();
	}

}
