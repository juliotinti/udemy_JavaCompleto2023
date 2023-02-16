package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Sec13_department;
import model.entities.Sec13_hourContract;
import model.entities.Sec13_worker;
import model.enums.Sec13_workerLevel;

public class Sec13_ex1 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();		
		Sec13_worker worker = new Sec13_worker(workerName, Sec13_workerLevel.valueOf(workerLevel), baseSalary, new Sec13_department(departmentName));
		
		System.out.print("How many contracts to this worker: ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++)
		{
			sc.nextLine();
			System.out.println("Enter contract #" + i+1 + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			String dateString = sc.nextLine();
			LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			Sec13_hourContract contract = new Sec13_hourContract(date, value, hours);
			worker.addContract(contract);
		}
		sc.nextLine();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String incomeDateString = sc.nextLine();
		int month = Integer.parseInt(incomeDateString.substring(0,2));
		int year = Integer.parseInt(incomeDateString.substring(3));
		System.out.printf("Name: %s\nDepartment: %s\nIncome of %s: %.2f", worker.getName(), worker.getDepartment(), incomeDateString,
				worker.income(year, month));
		
		sc.close();
	}

}
