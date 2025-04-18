package day13;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaTest6 {

	public static void main(String[] args) {
		// Predicate<T>
		// 應用 1
		Predicate<Integer> pass = (score) -> score >= 60;
		System.out.println(pass.test(85));
		System.out.println(pass.test(35));
		System.out.println("--------");
		// 應用 2
		Stream.of(100, 40, 75, 55, 80)
			  .filter(pass)
			  .forEach(System.out::println);
		
	}

}
