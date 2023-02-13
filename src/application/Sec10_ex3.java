package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Sec10_pessoa;

public class Sec10_ex3 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tot; 
		double soma = 0.0, qtdMenor = 0.0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		tot = sc.nextInt();
		Sec10_pessoa[] dados = new Sec10_pessoa[tot];		
		int[] indices = new int[tot]; 
		
		for(int i = 0; i < indices.length; i++)
			indices[i]=0;
		
		for(int i = 0; i < dados.length; i++)
		{
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: ", i+1);
			
			System.out.printf("\nNome: ");
			String name = sc.nextLine();
			System.out.printf("Idade: ");
			int idade = sc.nextInt();
			System.out.printf("Altura: ");
			double altura = sc.nextDouble();
			dados[i] = new Sec10_pessoa(name, idade, altura);
			
			if(dados[i].getIdade() < 16)
			{
				qtdMenor++;	
				indices[i] = 1;
			}
			soma += dados[i].getAltura();
		}
		
		System.out.printf("\nAltura Média: %.2f", soma/dados.length);
		System.out.printf("\nPessoas com menos de 16 anos: %.2f %%\n", qtdMenor/dados.length*100);
		for(int i = 0; i < dados.length; i++)
		{
			if(indices[i] == 1)
				System.out.println(dados[i].getName());
		}

		
	}
	
}
