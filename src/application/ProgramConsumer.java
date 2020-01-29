package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product1;

public class ProgramConsumer {

	public static void main(String[] args) {

		List<Product1> list = new ArrayList<>();

		list.add(new Product1("Tv", 900.00));
		list.add(new Product1("Mouse", 50.00));
		list.add(new Product1("Tablet", 350.50));
		list.add(new Product1("HD Case", 80.90));
		
		Consumer<Product1> cons = p -> p.setPrice(p.getPrice() * 1.1);
		
//		list.forEach(new PriceUpdate());
//		list.forEach(Product1::staticPriceUpdate);
//		list.forEach(Product1::nonStaticPriceUpdate);
//		list.forEach(cons);
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		list.forEach(System.out::println);
		
	}

}
