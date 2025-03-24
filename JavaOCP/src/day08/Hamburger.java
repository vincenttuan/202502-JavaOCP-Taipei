package day08;

public class Hamburger extends Food {
	private int level;   // 幾層漢堡
	
	public Hamburger() {
		
	}
	
	public Hamburger(String name, int price, int level) {
		super(name, price);
		//setName(name);
		//setPrice(price);
		setLevel(level);
		//this.level = level;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public void printInfo() {
		System.out.printf("%d層%s $%d%n", getLevel(), getName(), getPrice());
	}
	
	
}
