package day03;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = new int[5];
		//     scores -> [0, 0, 0, 0, 0] 有初始值
		// 維度 index  ->  0  1  2  3  4 
		// 長度 length = 5
		// 最小維度 = 0
		// 最大維度 = 4 (5-1) 公式: 陣列長度 length - 1
		// 給定資料 scores[0] = 90;
		
		scores[0] = 90;
		scores[1] = 100;
		scores[2] = 50;
		scores[3] = 70;
		scores[4] = 35;
		
		System.out.println(scores); // [I@65ae6ba4: "["(一維陣列) "I"(整數) @(在) "65ae6ba4"(雜湊值)
		System.out.println(scores.length);
		System.out.println(scores[0] + ", " + scores[1] + ", " + scores[2] + ", " + scores[3] + ", " + scores[4]);
		
		// 利用 for-loop
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i] + ", ");
		}
		System.out.println();
		
		// 利用 for-each(in)
		for(int score : scores) {
			System.out.print(score + ", ");
		}
		System.out.println();
		
		// Java 8 stream 來分析陣列元素
		Arrays.stream(scores).forEach(score -> System.out.print(score + ", "));
		System.out.println();
		
		// 利用 Arrays.toString() 直接印出陣列元素
		System.out.println(Arrays.toString(scores));
	}

}
