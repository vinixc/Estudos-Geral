package util;

import java.util.Comparator;

import entities.Product1;

public class MyComparator implements Comparator<Product1>{

	@Override
	public int compare(Product1 p1, Product1 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
