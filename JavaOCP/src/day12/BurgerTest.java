package day12;

public class BurgerTest {

	public static void main(String[] args) {
		Burger burger1 = new Burger("牛肉", 1);
		burger1.describe();
		System.out.println("--------");
		Burger burger2 = new Burger("豬肉", 1);
		burger2.addEgg();
		burger2.addEgg();
		burger2.describe();
		
	}

}
