package day07;

import java.util.stream.Stream;

// 快餐店
public class FastFoodStore2 {

	public static void main(String[] args) {
		// 單點
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
		Combo c1 = new Combo("一號餐", f1, d1);
		Combo c2 = new Combo("二號餐", f2, d3);
		Combo c3 = new Combo("三號餐", f3, d2);
		System.out.println("== 組合餐菜單 =========");
		System.out.printf("%s%n%s%n%s%n", c1, c2, c3);
		
		// (單點+組合餐)購物車
		System.out.println("== 購物車資料 =========");
		Object[] cart = {f2, c1, d3};
		for(Object item : cart) {
			System.out.println(item);
		}
		
	}

}
