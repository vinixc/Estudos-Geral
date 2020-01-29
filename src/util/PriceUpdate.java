package util;

import java.util.function.Consumer;

import entities.Product1;

public class PriceUpdate implements Consumer<Product1>{

	@Override
	public void accept(Product1 p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
