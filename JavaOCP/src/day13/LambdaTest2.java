package day13;

import java.util.stream.IntStream;

public class LambdaTest2 {

	public static void main(String[] args) {
		int[] scores = {90, 45, 65, 80, 35};
		filterScore(scores, (score) -> score >= 60);
	}
	
	public static void filterScore(int[] scores, Check check) {
		IntStream.of(scores)
				 .filter(score -> check.test(score))
				 .forEach(score -> System.out.println(score));
	}

}
