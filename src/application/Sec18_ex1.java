package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Sec18_contract;
import model.entities.Sec18_installment;
import model.service.Sec18_contractService;
import model.service.Sec18_paypalService;

public class Sec18_ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();	
		Sec18_contract contract = new Sec18_contract(number, date, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int months = sc.nextInt();
		
		Sec18_contractService contractService = new Sec18_contractService(new Sec18_paypalService());
		System.out.println("Parcelas: ");
		contractService.processContract(contract, months);
		for(Sec18_installment c : contract.getInstallments())
			System.out.println(c);
		
		sc.close();
	}

}
