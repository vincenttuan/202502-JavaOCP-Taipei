package day14;

// 糖果工廠
public class CandyFactory {
	
	private String factoryName = "台北糖果工廠";
	
	// 糖果 (static inner class, 不可取用外部類別的資源, 可以有類別(static)成員)
	public static class Candy {
		private String name; // 物件變數
		private static int price = 100; // 類別變數
		
		public Candy(String name) {
			this.name = name;
		}
		
		public void display() {
			System.out.printf("🍬糖果名稱: %s 價格: $%d%n", name, price);
		}
	}
	
	// 糖果機 (inner class, 可以取用外部類別的資源, 不可以有類別(static)成員)
	public class Machine {
		
		public void display() {
			System.out.printf("機器編號: 001 所屬工廠: %s%n", CandyFactory.this.factoryName);
		}
		
	}
	
}
