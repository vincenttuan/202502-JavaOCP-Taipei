package day03;

public class DrinkMain {

	public static void main(String[] args) {
		// 用來操作 Drink
		Drink drink1 = new Drink();
		drink1.name = "紅茶";
		drink1.price = 10;
		drink1.cc = 350;
		
		Drink drink2 = new Drink("咖啡", 60, 550);
		
		Drink drink3 = new Drink("牛奶", 40, 400);
		
		System.out.printf("name: %s price: %d cc:%d%n", drink1.name, drink1.price, drink1.cc);
		System.out.printf("name: %s price: %d cc:%d%n", drink2.name, drink2.price, drink2.cc);
		System.out.printf("name: %s price: %d cc:%d%n", drink3.name, drink3.price, drink3.cc);
		
		int total = drink1.price + drink2.price + drink3.price;
		System.out.printf("總價: %d%n", total);
	}
}
