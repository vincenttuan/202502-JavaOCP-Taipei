package day12;

// 漢堡(外部類別)
public class Burger {
	
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
