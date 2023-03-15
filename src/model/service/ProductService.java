package model.service;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Sec20_product;

public class ProductService {

	public double filteredSum(List<Sec20_product> list, Predicate<Sec20_product> criteria) {
		double sum = 0.0;
		for (Sec20_product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}