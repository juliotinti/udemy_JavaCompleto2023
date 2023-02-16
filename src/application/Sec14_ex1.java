package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Sec14_importedProduct;
import entities.Sec14_product;
import entities.Sec14_usedProduct;

public class Sec14_ex1 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		List<Sec14_product> products = new ArrayList<>();
		for(int i = 1; i<=quantity; i++){
			System.out.println("Product #" + i + " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.nextLine().charAt(0);	
			System.out.print("Name: ");
			String name = sc.nextLine();		
			System.out.print("Price: ");
			double price = sc.nextDouble();	
			sc.nextLine();
			if(type == 'i'){
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();	
				products.add(new Sec14_importedProduct(name, price, customsFee));
				sc.nextLine();
			}
			else if(type == 'u'){
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateString = sc.nextLine();
				LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
				products.add(new Sec14_usedProduct(name, price, date));
			}
			else{
				products.add(new Sec14_product(name, price));
			}
		}
		System.out.println("PRICE TAGS: ");
		for(Sec14_product _products: products)
		{
			System.out.println(_products.priceTag());
		}
		sc.close();
	}

}
