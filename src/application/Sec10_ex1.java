package application;

import java.util.Scanner;

public class Sec10_ex1 {

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
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int v: vetor)
		{
			if(v < 0)
				System.out.println(v);
		}
		
	}

}
