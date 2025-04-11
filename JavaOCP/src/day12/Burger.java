package day12;

// 漢堡(外部類別)
public class Burger {
	
	private Meat meat;
	private Egg egg;
	
	public Burger(String meatType, int eggCount) {
		this.meat = new Meat(meatType);
		this.egg = new Egg(eggCount);
	}
	
	public void addEgg() {
		egg.addOne();
	}
	
	public void describe() {
		System.out.println("Bueger 內有:");
		meat.describe();
		egg.describe();
	}
	
	//-----------------------------------------------
	// 肉(內部類別)
	public class Meat {
		private String type;
		public Meat(String type) {
			this.type = type;
		}
		public void describe() {
			System.out.println("Meat: " + type);
		}
	}
	
	// 蛋(內部類別)
	public class Egg {
		private int count;
		public Egg(int count) {
			this.count = count;
		}
		public void addOne() {
			count++;
		}
		public void describe() {
			System.out.println("Eggs: " + count);
		}
	}
	
}
