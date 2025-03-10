package day04;

import java.util.stream.IntStream;

public class ArrayDemo10 {
	public static void main(String[] args) {
		int[] scores1 = {50,  90, 20, 80};
		int[] scores2 = {75, 99, 45, 65, 95};
		// 計算全部分數加總為何 ?
		int sum = IntStream.concat(IntStream.of(scores1), IntStream.of(scores2)).sum();
		System.out.println(sum);
		
	}
}
