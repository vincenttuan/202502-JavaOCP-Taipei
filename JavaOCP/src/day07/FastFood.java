package day07;

// 速食設計
public class FastFood {
	String name; // 品名(物件變數)
	int price;   // 價格(物件變數)
	
	// 建構子封裝
	public FastFood(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 方法封裝 setter / getter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
