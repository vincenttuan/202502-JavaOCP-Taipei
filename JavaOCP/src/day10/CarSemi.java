package day10;

// 抽象類
public abstract class CarSemi implements Car {
	private String name;
	private int price;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPrice() {
		return price;
	}
	
}
