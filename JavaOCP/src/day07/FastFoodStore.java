package day07;

// 快餐店
public class FastFoodStore {

	public static void main(String[] args) {
		// 單點
		FastFood f1 = new FastFood("漢堡", 50);
		FastFood f2 = new FastFood("炸雞", 60);
		FastFood f3 = new FastFood("義大利麵", 75);
		Drink d1 = new Drink("可樂", 20, false);
		Drink d2 = new Drink("咖啡", 30, true);
		Drink d3 = new Drink("紅茶", 25, false);
		System.out.println("== 單點菜單 ==========");
		System.out.printf("%s%n%s%n%s%n", f1, f2, f3);
		System.out.printf("%s%n%s%n%s%n", d1, d2, d3);
		
		// 組合餐
		Combo c1 = new Combo("一號餐", f1, d1);
		Combo c2 = new Combo("二號餐", f2, d3);
		Combo c3 = new Combo("三號餐", f3, d2);
		System.out.println("== 組合餐菜單 =========");
		System.out.printf("%s%n%s%n%s%n", c1, c2, c3);
		
		// (組合餐)購物車
		Combo[] combos = {c1, c1, c2, c3, c3, c3};
		// 請印出我買的組合餐名稱+價格與總價
		// 一號餐(漢堡 冰可樂) $70
		// 一號餐(漢堡 冰可樂) $70
		// 二號餐(炸雞 冰紅茶) $85
		// 三號餐(義大利麵 熱咖啡) $105
		// 三號餐(義大利麵 熱咖啡) $105
		// 三號餐(義大利麵 熱咖啡) $105
		// ----------
		// 總價 $540
		int totalPrice = 0;
		for(Combo combo : combos) {
			String comboName = combo.getName(); // 組合餐名
			String fastFoodName = combo.getFastFood().getName(); // 主餐名
			String hotOrCool = combo.getDrink().isHot() ? "熱" : "冰";
			String drinkName = combo.getDrink().getName();
			int comboPrice = combo.getPrice(); // 組合餐價格
			totalPrice += comboPrice;
			System.out.printf("%s(%s %s%s) $%d%n", comboName, fastFoodName, hotOrCool, drinkName, comboPrice);
		}
		System.out.printf("總價 $%d%n", totalPrice);
		
	}

}
