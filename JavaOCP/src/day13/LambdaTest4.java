package day13;

import java.util.function.Consumer;

public class LambdaTest4 {

	public static void main(String[] args) {
		// Consumer<T> 應用
		Consumer<String> consumer = (t) -> System.out.println("程式語言:" + t);
		
		consumer.accept("Java");
		consumer.accept("C#");
		

	}

}
