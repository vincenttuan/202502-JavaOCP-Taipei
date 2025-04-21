package day14;

// 糖果工廠
public class CandyFactory {
	
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
	
}
