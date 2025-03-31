package day10;

// 抽象類
public abstract class DrinkSemi implements Drink {

	private String name; // 保存品名
	private int price; // 保存價格
	
	//-- 抽象方法 ----------------------------
	public abstract String getOrigin();
	//--------------------------------------
	
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
