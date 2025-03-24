package day08;

public class Drink extends Food {
	private boolean hot;   // 冷熱

	public boolean isHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}
	
	@Override
	public void printInfo() {
		System.out.printf("%s%s $%d%n", isHot()?"熱":"冰", getName(), getPrice());
	}
	
}
