package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Sec13_client;
import entities.Sec13_order;
import entities.Sec13_orderItem;
import entities.Sec13_product;
import entities.enums.Aula_enum_orderStatus;

public class Sec13_ex3 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		String birthDateString = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Sec13_client client = new Sec13_client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order: ");
		int quantity = sc.nextInt();	
		Sec13_order order = new Sec13_order(LocalDateTime.now(), Aula_enum_orderStatus.valueOf(status), client);
		for(int i = 0; i < quantity; i++)
		{
			sc.nextLine();
			System.out.println("Enter #" + i+1 + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			order.addItem(new Sec13_orderItem(productQuantity, new Sec13_product(productName, productPrice)));
		}
		
		System.out.println(order);
		sc.close();
	}

}
