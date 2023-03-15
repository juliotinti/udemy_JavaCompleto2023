package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Sec20_product;

public class Sec20_ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Sec20_product> list = new ArrayList<>();

		list.add(new Sec20_product("TV", 900.00));
		list.add(new Sec20_product("Notebook", 1200.00));
		list.add(new Sec20_product("Tablet", 450.00));
		
		list.sort( (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) );		
		
		for(Sec20_product prod : list)
			System.out.println(prod);

	}

}
