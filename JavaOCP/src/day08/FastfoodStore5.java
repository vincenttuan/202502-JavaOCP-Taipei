package day08;

public class FastfoodStore5 {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("大麥克", 81, 2);
		Drink drink = new Drink("可樂", 20, false);
		Food[] foods = {hamburger, drink};
		//--------------------------------------------------
		System.out.println(foods[0] instanceof Hamburger); // true
		System.out.println(foods[0] instanceof Drink); // false
		System.out.println(foods[1] instanceof Hamburger); // false
		System.out.println(foods[1] instanceof Drink); // true
		
	}

}
