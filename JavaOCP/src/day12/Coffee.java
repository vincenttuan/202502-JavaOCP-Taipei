package day12;

public class Coffee {
	private Bean bean;
	private Milk milk;
	private Sugar sugar;
	
	Coffee() {
		
	}
	
	Coffee(Bean bean, Milk milk, Sugar sugar) {
		this.bean = bean;
		this.milk = milk;
		this.sugar = sugar;
	}
	
	void describe() {
		System.out.println("Coffee 內有:");
		bean.describe();
		milk.describe();
		sugar.describe();
	}
	
	// 咖啡豆(內部類別)
 	class Bean {
		private String type;
		Bean(String type) {
			this.type = type;
		}
		void describe() {
			System.out.println("Bean: " + type);
		}
	}
	
	// 牛奶(內部類別)
	class Milk {
		private int ml;
		public Milk(int ml) {
			this.ml = ml;
		}
		void describe() {
			System.out.println("Milk: " + ml + " ml");
		}
	}
	
	// 糖(內部類別)
	class Sugar {
		private int level; // 幾分糖(0~10)
		public Sugar(int level) {
			this.level = level;
		}
		void describe() {
			System.out.println("Sugar: " + level + " 分");
		}
	}
	
}
