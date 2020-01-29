package entities;

public class Product1{
	
	private String name;
	private Double price;
	
	public Product1(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product1 p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}
	
	public static void staticPriceUpdate(Product1 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
	}
	
	public static String staticUpperCaseName(Product1 p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", price=" + String.format("%.2f", price) + "]";
	}

}
