package day13;

import java.util.function.Predicate;
import java.util.stream.IntStream;

interface Check {
	boolean test(int score);
}

public class LambdaTest {

	public static void main(String[] args) {
		int[] scores = {90, 45, 65, 80, 35};
		// 判斷及格
		Check checkPass = (score) -> score >= 60;
		// 判斷不及格
		Check checkNonPass = (score) -> score < 60;
		
		// 過濾出及格分數並逐一輸出
		IntStream.of(scores)
				 .filter(score -> checkPass.test(score))
				 .forEach(score -> System.out.println(score));
		System.out.println("----");
		// 過濾出不及格分數並逐一輸出
		IntStream.of(scores)
				 .filter(score -> checkNonPass.test(score))
				 .forEach(score -> System.out.println(score));
				
	}
	
	

}
