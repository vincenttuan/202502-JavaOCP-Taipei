package day14;

// 糖果工廠
public class CandyFactory {
	
	public static class Candy {
		private String name;
		
		public Candy(String name) {
			this.name = name;
		}
		
		public void display() {
			System.out.printf("🍬糖果名稱: %s%n", name);
		}
	}
	
}
