package test;

public class DrinkMain {

	public static void main(String[] args) {
		Drink1.name = "紅茶";
		Drink1.price = 10;
		Drink1.cc = 350;
		
		Drink2.name = "咖啡";
		Drink2.price = 60;
		Drink2.cc = 550;
		
		Drink3.name = "牛奶";
		Drink3.price = 40;
		Drink3.cc = 400;
		
		System.out.printf("name: %s price: %d cc: %d%n", Drink1.name, Drink1.price, Drink1.cc);
		System.out.printf("name: %s price: %d cc: %d%n", Drink2.name, Drink2.price, Drink2.cc);
		System.out.printf("name: %s price: %d cc: %d%n", Drink3.name, Drink3.price, Drink3.cc);
		
		
	}

}
