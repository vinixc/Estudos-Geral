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
	
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", price=" + price + "]";
	}

}
