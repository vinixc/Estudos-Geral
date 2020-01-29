package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product1;
import util.ProductService;

public class ProgramExercicioFunction {
	
	public static void main(String[] args) {
		
		List<Product1> list = new ArrayList<>();

		list.add(new Product1("Tv", 900.00));
		list.add(new Product1("Mouse", 50.00));
		list.add(new Product1("Tablet", 350.50));
		list.add(new Product1("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
