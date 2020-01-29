package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product1;

public class ProgramFunction {

	public static void main(String[] args) {
		
		List<Product1> list = new ArrayList<>();

		list.add(new Product1("Tv", 900.00));
		list.add(new Product1("Mouse", 50.00));
		list.add(new Product1("Tablet", 350.50));
		list.add(new Product1("HD Case", 80.90));
		
		Function<Product1, String> func = p -> p.getName().toUpperCase();
		
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
//		List<String> names = list.stream().map(Product1::staticUpperCaseName).collect(Collectors.toList());
//		List<String> names = list.stream().map(Product1::nonStaticUpperCaseName).collect(Collectors.toList());
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println);
	}
}
