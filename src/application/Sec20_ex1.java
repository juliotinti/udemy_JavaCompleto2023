package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Sec20_product;

public class Sec20_ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Sec20_product> list = new ArrayList<>();
		list.add(new Sec20_product("Mouse", 50.00));
		list.add(new Sec20_product("Tablet", 350.50));
		list.add(new Sec20_product("HD Case", 80.90));
		
		double min = 100.0; //podemos pedir para o usuário esse valor
		list.removeIf(p -> p.getPrice() >= min); //assim se escreve um predicado
		
		for (Sec20_product prod : list)
			System.out.println(prod);
		
		
	}

}
