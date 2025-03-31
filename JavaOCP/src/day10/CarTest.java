package day10;

public class CarTest {

	public static void main(String[] args) {
		Car benz = new Benz("Benz", 300_0000);
		Car bmw = new BMW("BMW", 250_0000);
		Car honda = new Honda("Honda", 110_0000);
		Car toyota = new Toyota("Toyota", 90_0000);
		
		Car[] cars = {benz, bmw, honda, toyota};
		for(Car car : cars) {
			System.out.printf("品牌 %-6s 價格 $%,9d%n", car.getName(), car.getPrice());
		}
		// 總價與平均

	}

}
