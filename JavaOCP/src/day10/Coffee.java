package day10;

// 實現類
public class Coffee implements Drink {
	private String name; // 保存品名
	private int price; // 保存價格
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	
}
