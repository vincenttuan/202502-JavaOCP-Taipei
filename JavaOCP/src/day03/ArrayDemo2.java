package day03;

import java.util.Arrays;

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
		
		// 只要印出及格的分數 for-in
		for(int score : scores) {
			if(score >= 60) {
				System.out.print(score + ", ");
			}
		}
		System.out.println();
		
		
	}

}
