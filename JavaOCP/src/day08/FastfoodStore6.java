package day08;

import java.util.stream.Stream;

public class FastfoodStore6 {
	public static void main(String[] args) {
		Hamburger hamburger1 = new Hamburger("大麥克", 81, 2);
		Hamburger hamburger2 = new Hamburger("麥香魚", 52, 1);
		Hamburger hamburger3 = new Hamburger("嫩煎雞腿堡", 86, 1);
		Drink drink1 = new Drink("可樂", 20, false);
		Drink drink2 = new Drink("咖啡", 45, true);
		Drink drink3 = new Drink("雪碧", 20, false);
		//---------------------------------------------------
		// 多型
		Food[] foods = {hamburger1, drink1, hamburger2, drink2, drink3, hamburger3};
		// 透過分析 foods 請印出所有漢堡名稱
		for(int i=0;i<foods.length;i++) {
			if(foods[i] instanceof Hamburger) {
				System.out.println(foods[i].getName());
			}
		}
		// ------------------------------------------------
		for(Food food : foods) {
			if(food instanceof Hamburger) {
				System.out.println(food.getName());
			}
		}
		// ------------------------------------------------
		Stream.of(foods)
			  .filter(food -> food instanceof Hamburger)
			  .forEach(food -> System.out.println(food.getName()));
	}
}
