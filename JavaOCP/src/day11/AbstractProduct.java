package day11;

// 抽象商品類別
public abstract class AbstractProduct implements Product {
	
	protected String name; // 商品名稱
	protected int price; // 商品價格
	
	public AbstractProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void display() {
		System.out.printf("商品名稱:%s 價格:$%d%n", name, price);
	}
	
	public abstract void applyDiscount(); // 進行折扣
	
}
