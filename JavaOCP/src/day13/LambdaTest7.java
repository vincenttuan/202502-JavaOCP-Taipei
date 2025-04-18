package day13;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class LambdaTest7 {

	public static void main(String[] args) {
		// Supplier<T>
		// 應用 1 (得到現在時刻)
		Supplier<Date> now = () -> new Date();
		System.out.println(now.get());
		
		// 應用 2 (得到幸運數字)
		Supplier<Integer> luckyNumber = () -> new Random().nextInt(100);
		System.out.println(luckyNumber.get());
	}

}
