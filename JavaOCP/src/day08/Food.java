package day08;

public class Food {
	private String name; // 名稱
	private int price;   // 價格
	
	public Food() {
		
	}
	
	public Food(String name, int price) {
		setName(name);
		setPrice(price);
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
	
	public void printInfo() {
		System.out.printf("%s $%d%n", name, price);
	}
	
}
