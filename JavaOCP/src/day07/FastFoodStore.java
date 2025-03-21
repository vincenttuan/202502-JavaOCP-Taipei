package day07;

// 快餐店
public class FastFoodStore {

	public static void main(String[] args) {
		FastFood f1 = new FastFood("漢堡", 50);
		FastFood f2 = new FastFood("炸雞", 60);
		FastFood f3 = new FastFood("義大利麵", 75);
		Drink d1 = new Drink("可樂", 20, false);
		Drink d2 = new Drink("咖啡", 30, true);
		Drink d3 = new Drink("紅茶", 25, false);
		System.out.println("== 單點菜單 ==========");
		System.out.printf("%s%n%s%n%s%n", f1, f2, f3);
		System.out.printf("%s%n%s%n%s%n", d1, d2, d3);
		
		// 組合餐
		

	}

}
