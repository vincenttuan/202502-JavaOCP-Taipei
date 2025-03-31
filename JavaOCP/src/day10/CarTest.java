package day10;

import java.util.stream.Stream;

public class CarTest {

	public static void main(String[] args) {
		Car benz = new Benz("Benz", 300_0000);
		Car bmw = new BMW("BMW", 250_0000);
		Car honda = new Honda("Honda", 110_0000);
		Car toyota = new Toyota("Toyota", 90_0000);
		
		System.out.printf("%d門房車%n", Car.DOORS);
		Car[] cars = {benz, bmw, honda, toyota};
		for(Car car : cars) {
			System.out.printf("品牌 %-6s 價格 $%,9d%n", car.getName(), car.getPrice());
		}
		// 總價與平均
		//int sum = Stream.of(cars).mapToInt(car -> car.getPrice()).sum();
		int sum = Stream.of(cars).mapToInt(Car::getPrice).sum();
		
		//double avg = Stream.of(cars).mapToInt(car -> car.getPrice()).average().getAsDouble();
		double avg = Stream.of(cars).mapToInt(Car::getPrice).average().getAsDouble();
		
		System.out.printf("總價:$%,d 平均:$%,.0f", sum, avg);
		
	}

}
