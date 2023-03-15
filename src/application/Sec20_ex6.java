package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sec20_ex6 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream();
		Stream<Integer> st2 = list.stream().map(x -> x*10);
		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println(Arrays.toString(st2.toArray()));

		Stream<String> st3 = Stream.of("Maria", "Bob", "Kira");
		System.out.println(Arrays.toString(st3.toArray()));
		
		//cria uma string a partir de iterações, começa em 0 e vai somando 2
		Stream<Integer> st4 = Stream.iterate(0, x -> x+2); 
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
		
		//gerar uma Stream que é a sequência de Fibonacci
		Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st5.limit(20).toArray()));
		
	}

}
