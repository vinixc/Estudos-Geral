package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product1;
import util.ProductPredicate;

public class ProgramPredicate {
	
	public static void main(String[] args) {
		
		List<Product1> list = new ArrayList<>();
		
		list.add(new Product1("Tv", 900.00));
		list.add(new Product1("Mouse", 50.00));
		list.add(new Product1("Tablet", 350.50));
		list.add(new Product1("HD Case", 80.90));
		
		Predicate<Product1> pred = p -> p.getPrice() >= 100.0;
		
//		list.removeIf(new ProductPredicate());
//		list.removeIf(Product1::staticProductPredicate);
//		list.removeIf(Product1::nonStaticProductPredicate);
//		list.removeIf(pred);
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		list.forEach(System.out::println);	

	}

}
