package day08;

public class FastfoodStore {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger();
		hamburger.setName("大麥克");
		hamburger.setPrice(70);
		hamburger.setLevel(2);
		//-------------------------------------
		Drink drink = new Drink();
		drink.setName("可樂");
		drink.setPrice(20);
		drink.setHot(false);
		//-------------------------------------
		// 請印出這二項產品資料
		// 大麥克2層 $70
		// 冰可樂 $20
		

	}

}
