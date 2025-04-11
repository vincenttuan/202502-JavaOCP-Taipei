package day12;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee coffee = new Coffee("Java豆", 100, 3);
		coffee.describe();
		System.out.println("------------");
		Coffee.Bean bean = new Coffee().new Bean("巴西豆");
		bean.describe();
		System.out.println("------------");
		Coffee.Milk milk = new Coffee().new Milk(250);
		milk.describe();
	}

}
