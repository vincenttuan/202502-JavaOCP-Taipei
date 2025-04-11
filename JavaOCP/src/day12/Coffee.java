package day12;

public class Coffee {
	
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
		
	}
	
}
