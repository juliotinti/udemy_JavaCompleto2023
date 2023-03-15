package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Sec20_product;

public class Sec20_ex3 {

	public static void main(String[] args) {
		
		List<Sec20_product> list = new ArrayList<>();
		list.add(new Sec20_product("Tv", 900.00));
		list.add(new Sec20_product("Mouse", 50.00));
		list.add(new Sec20_product("Tablet", 350.50));
		list.add(new Sec20_product("HD Case", 80.90));
		
		double factor = 1.1; 
		list.forEach( p -> p.setPrice(p.getPrice() * factor) );
		
		list.forEach(System.out::println);
	}

}
