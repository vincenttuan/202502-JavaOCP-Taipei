package day07;

// 組合餐設計(組合)
public class Combo {
	private String name; // 組合餐名
	private FastFood fastFood; // 主餐
	private Drink drink; // 飲品
	private int price; // 價格
	
	public Combo(String name, FastFood fastFood, Drink drink) {
		this.name = name;
		this.fastFood = fastFood;
		this.drink = drink;
		this.price = fastFood.getPrice() + drink.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FastFood getFastFood() {
		return fastFood;
	}

	public void setFastFood(FastFood fastFood) {
		this.fastFood = fastFood;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Combo [name=" + name + ", fastFood=" + fastFood + ", drink=" + drink + ", price=" + price + "]";
	}
	
	
}
