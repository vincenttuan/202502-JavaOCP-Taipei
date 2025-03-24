package day08;

import java.util.stream.Stream;

public class FastfoodStore4 {
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
		// 透過分析 foods 請計算出冷飲的總價為和 ?
		int sum1 = 0;
		for(int i=0;i<foods.length;i++) {
			if(foods[i] instanceof Drink) { // 判斷是否可以轉型
				Drink drink = (Drink)foods[i]; // 轉型
				if(!drink.isHot()) { // 冷飲
					sum1 += drink.getPrice(); // 累加
				}
			}
		}
		System.out.println(sum1);
		//---------------------------------------------------
		int sum2 = Stream.of(foods) // [Food, Food, Food, Food, Food, Food] 含有 Hamburger 與 Drink
						 .filter(food -> food instanceof Drink)  // [Food, Food, Food] 可以轉成 Drink 的
						 .map(food -> (Drink)food)               // [Drink, Drink, Drink] 轉成 Drink
						 .filter(drink -> !drink.isHot())        // [Drink, Drink] 冷飲的 Drink
						 .mapToInt(drink -> drink.getPrice())    // [20, 20] 冷飲的價格
						 .sum(); // 總和
		System.out.println(sum2);
	}
}
