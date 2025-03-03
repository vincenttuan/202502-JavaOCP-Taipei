package day02;

/*
 * 飲料一瓶 10 元
 * 購買 n 瓶
 * 請撰寫
 * 買一送一方法
 * 買二送一方法
 * 買五送二方法
 * 可以回傳應付款金額
*/
public class MySales {
	
	static int price = 10;
	
	public static void main(String[] args) {
		
		int qty1 = 5;
		//int currentQty = qty1 / 2 + qty1 % 2; // 實際要付的瓶數
		//int cost = currentQty * price;
		int cost1 = buyOneGetOneFree(qty1); // 買一送一
		System.out.println(cost1);
		// -----------------------------------------------------
		int qty2 = 5;
		int cost2 = buyTwoGetOneFree(qty2); // 買二送一
		System.out.println(cost2);
		// -----------------------------------------------------
		int qty3 = 15;
		int cost3 = buyFiveGetTwoFree(qty3);
		System.out.println(cost3);
	}
	
	// 買五送二
	public static int buyFiveGetTwoFree(int qty) {
		int currentQty = (qty / 7)*5 + qty % 7;
		int cost = currentQty * price;
		return cost;
	}
	
	// 買一送一
	public static int buyOneGetOneFree(int qty) {
		int currentQty = qty / 2 + qty % 2; // 實際要付的瓶數
		int cost = currentQty * price;
		return cost;
	}
	
	// 買二送一
	public static int buyTwoGetOneFree(int qty) {
		int currentQty = (qty / 3)*2 + qty % 3;
		int cost = currentQty * price;
		return cost;
	}
	
}
