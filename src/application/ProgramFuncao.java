package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product1;

public class ProgramFuncao {
	
	public static int compareProducts(Product1 p1, Product1 p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		
		List<Product1> list = new ArrayList<>();
		list.add(new Product1("TV", 900.00));
		list.add(new Product1("Notebook", 1200.00));
		list.add(new Product1("Tablet", 450.00));
		
		list.sort(ProgramFuncao::compareProducts);
		
		list.forEach(System.out::println);
	}
}
