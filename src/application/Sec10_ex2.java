package application;

import java.util.Locale;
import java.util.Scanner;

public class Sec10_ex2 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tot; 
		System.out.print("Quantos nrs voce vai digitar? ");
		tot = sc.nextInt();
		double[] vetor = new double[tot];
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		System.out.printf("VALORES = ");
		for(double v: vetor)
		{
			System.out.printf("%.2f ", v);
		}
		System.out.printf("\nSOMA = %.2f", soma);
		System.out.printf("\nMEDIA = %.2f", soma/vetor.length);
		sc.close();
	}

}
