package day08;

public class FastfoodStore3 {
	public static void main(String[] args) {
		Hamburger hamburger1 = new Hamburger("大麥克", 81, 2);
		Hamburger hamburger2 = new Hamburger("麥香魚", 52, 1);
		Hamburger hamburger3 = new Hamburger("嫩煎雞腿堡", 86, 1);
		Drink drink1 = new Drink("可樂", 20, false);
		Drink drink2 = new Drink("咖啡", 45, true);
		Drink drink3 = new Drink("雪碧", 20, false);
		//---------------------------------------------------
		Hamburger[] hamburgers = {hamburger1, hamburger2, hamburger3};
		Drink[] drinks = {drink1, drink2, drink3};
		// 多型
		Food[] foods = {hamburger1, drink1, hamburger2, drink2, drink3, hamburger3};
		System.out.println(foods[0].getName());
		System.out.println(foods[0].getPrice());
		//System.out.println(foods[0].getLevel()); // 錯誤
		// 透過轉型
		System.out.println(((Hamburger)foods[0]).getLevel()); // 利用轉型就可以呼叫 getLevel() 方法
		// 透過轉型的風險
		//System.out.println(((Drink)foods[0]).isHot()); // 可能會轉型失敗
		// 正確的轉型應該透過 instanceof 來判斷
		if(foods[0] instanceof Drink) {
			System.out.println(((Drink)foods[0]).isHot()); // 放心去轉型
		} else {
			System.out.println("foods[0] 不可轉型成 Drink");
		}
		
		
	}
}
