package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product1;

public class ProductService {
	
	public double filteredSum(List<Product1> list, Predicate<Product1> criteria) {
		double sum = 0.0;
		
		for(Product1 p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
