package application;

import java.util.Scanner;

public class Sec10_ex4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int tot; 
		System.out.print("Quantos nrs voce vai digitar? ");
		tot = sc.nextInt();
		int[] vetor = new int[tot];
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES: ");
		int qtd = 0; 
		for(int v: vetor)
		{
			if(v%2 == 0)
			{
				System.out.printf("%d  ", v);
				qtd++;
			}
		}
		System.out.printf("\n\nQUANTIDADE DE PARES: %d", qtd);
	}

}
