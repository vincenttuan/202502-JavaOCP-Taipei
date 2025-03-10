package day04;

import java.util.stream.IntStream;

public class ArrayDemo9 {
	public static void main(String[] args) {
		int[] scores1 = {50,  90, 20, 80};
		int[] scores2 = {75, 99, 45, 65, 95};
		
		int max1 = IntStream.of(scores1).max().getAsInt();
		int max2 = IntStream.of(scores2).max().getAsInt();
		int max = Math.max(max1, max2);
		System.out.println(max);
		
	}
}
