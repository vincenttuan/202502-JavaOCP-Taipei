package day10;

public class DrinkTest {

	public static void main(String[] args) {
		Drink coffee = new Coffee();
		coffee.setName("拿鐵咖啡");
		coffee.setPrice(60);
		System.out.printf("%s $%d 產地:%s%n", 
				coffee.getName(), coffee.getPrice(), ((DrinkSemi)coffee).getOrigin());
		
		Drink tea = new Tea();
		tea.setName("紅茶拿鐵");
		tea.setPrice(37);
		System.out.printf("%s $%d 產地:%s%n", 
				tea.getName(), tea.getPrice(), ((DrinkSemi)tea).getOrigin());
	}

}
