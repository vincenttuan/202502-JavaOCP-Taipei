package day07;
	
// 飲品設計
public class Drink {
	private String name; // 品名(物件變數)
	private int price;   // 價格(物件變數)
	private boolean hot; // 熱飲(物件變數)
	
	// 建構子封裝
	public Drink(String name, int price, boolean hot) {
		this.name = name;
		this.price = price;
		this.hot = hot;
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

	public boolean isHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}
	
	
}
