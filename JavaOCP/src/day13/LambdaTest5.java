package day13;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaTest5 {

	public static void main(String[] args) {
		// Function<T, R>
		Function<Integer, Double> func = (r) -> r * r * 3.1415926;
		// 應用 1
		System.out.println(func.apply(5));
		System.out.println(func.apply(10));
		System.out.println("--------");
		// 應用 2
		Stream.of(10, 20, 30, 40, 50)
				 .map(func)
				 .forEach(System.out::println);
	}

}
