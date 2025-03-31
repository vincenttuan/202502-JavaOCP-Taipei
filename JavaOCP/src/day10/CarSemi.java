package day10;

// 抽象類
public abstract class CarSemi implements Car {
	private String name;
	private int price;
	
	// 建構子
	public CarSemi(String name, int price) {
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
	
}
