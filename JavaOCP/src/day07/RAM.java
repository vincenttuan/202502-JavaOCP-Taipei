package day07;

public class RAM {
	private String name;
	private int price;
	
	public RAM(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "RAM [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
