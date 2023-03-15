package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sec20_ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream().map(x -> x*20);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//como fazer uma soma com stream, voce usa o reduce que pede o elemtno inicial, e dpois uma função que recebe dois argumentos e gera um resultado
		//no nosso caso, será a soma
		int sum = list.stream().reduce(0, (x,y) -> x+y);
		//se quisermos o produtório
		float prod = list.stream().reduce(1, (x,y) -> x*y);
		System.out.println("Sum: " + sum);
		System.out.println("Prod: " + prod);
		
		//nesse caso, estou pegando a list e gerando uma nova com numero pares e multiplicando por 10 
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) //dou um predicado, e com base nesse predicado será gerado uma nova Stream que satisfaça o predicato
				.map(x -> x*10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
