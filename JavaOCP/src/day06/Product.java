package day06;

// 商品
public class Product {
	String name; // 品名
	int qty; // 數量
	int price; // 單價
	
	public Product(String name, int qty, int price) {
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
}
