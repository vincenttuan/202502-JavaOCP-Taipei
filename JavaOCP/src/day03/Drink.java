package day03;

public class Drink { // 飲料
	String name; // 名稱
	int price;   // 價格
	int cc;      // 容量
	
	public Drink() { // 建構子
		
	}
	
	public Drink(String name, int price, int cc) {
		this.name = name;
		this.price = price;
		this.cc = cc;
	}
}
