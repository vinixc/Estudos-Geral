package util;

import java.util.function.Predicate;

import entities.Product1;

public class ProductPredicate implements Predicate<Product1>{

	@Override
	public boolean test(Product1 p) {
		return p.getPrice() >= 100.0;
	}

}
