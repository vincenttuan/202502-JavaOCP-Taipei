package day07;

// 速食設計
public class FastFood {
	private String name; // 品名(物件變數)
	private int price;   // 價格(物件變數)
	
	// 建構子封裝
	public FastFood(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 方法封裝 setter / getter
	public void setName(String name) {
		if(name == null || name.length() == 0) {
			return;
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		if(price <= 0) { // 若 price <= 0 就提早結束方法
			return;
		}
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
