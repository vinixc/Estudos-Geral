package util;

import java.util.function.Function;

import entities.Product1;

public class UpperCaseName implements Function<Product1, String>{

	@Override
	public String apply(Product1 p) {
		return p.getName().toUpperCase();
	}

}
