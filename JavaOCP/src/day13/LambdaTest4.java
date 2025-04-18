package day13;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaTest4 {

	public static void main(String[] args) {
		// Consumer<T> 
		Consumer<String> consumer = (t) -> System.out.println("程式語言:" + t);
		// 應用 1
		consumer.accept("Java");
		consumer.accept("C#");
		System.out.println("-----------");
		// 應用 2
		Stream.of("Java", "C#", "VB", "Python")
			  .forEach(consumer);

	}

}
