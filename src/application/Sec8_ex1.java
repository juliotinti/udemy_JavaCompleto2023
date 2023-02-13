package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Sec8_rectangle;

public class Sec8_ex1 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width amd height: ");
		
		Sec8_rectangle ret = new Sec8_rectangle(); 
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n", ret.Area());
		System.out.printf("PERIMETER = %.2f\n", ret.Perimeter());
		System.out.printf("DIAGONAL = %.2f\n", ret.Diagonal());
		sc.close();
	}
}
