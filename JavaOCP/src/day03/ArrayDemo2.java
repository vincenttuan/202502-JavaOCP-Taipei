package day03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 陣列給予初始值 
		//int[] scores = new int[] {90, 100, 50, 70, 35};
		int[] scores = {90, 100, 50, 70, 35};
		
		System.out.println(Arrays.toString(scores));
		
		// 只要印出及格的分數 for-loop
		for(int i=0;i<scores.length;i++) {
			if(scores[i] >= 60) {
				System.out.print(scores[i] + ", ");
			}
		}
		System.out.println();
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i] < 60) {
				continue;
			}
			System.out.print(scores[i] + ", ");
		}
		System.out.println();
		
		// 只要印出及格的分數 for-each(in)
		for(int score : scores) {
			if(score >= 60) {
				System.out.print(score + ", ");
			}
		}
		System.out.println();
		
		// 利用 java 8 stream + filter 過濾資料
		Arrays.stream(scores) // 陣列串流化: 90 -> 100 -> 50 -> 70 -> 35
			  .filter(score -> score >= 60) // 只留下 score >= 60 的資料因此過濾出: 90 -> 100 -> 70 
			  .forEach(score -> System.out.print(score + ", ")); // 逐一印出資料: 90 -> 100 -> 70
		System.out.println();
		
		IntStream.of(scores) // 專門給 int[] 使用的串流
				 .filter(score -> score >= 60)
				 .forEach(score -> System.out.print(score + ", "));
		System.out.println();
		
		IntStream.of(90, 100, 50, 70, 35) // 專門給 int[] 使用的串流
				 .filter(score -> score >= 60)
				 .forEach(score -> System.out.print(score + ", "));
		System.out.println();
	}

}
