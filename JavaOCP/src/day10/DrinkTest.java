package day10;

public class DrinkTest {

	public static void main(String[] args) {
		Drink drink = new Coffee();
		drink.setName("拿鐵咖啡");
		drink.setPrice(60);
		System.out.printf("%s $%d%n", drink.getName(), drink.getPrice());
	}

}
