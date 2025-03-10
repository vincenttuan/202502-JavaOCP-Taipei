package day04;

import java.util.Arrays;

public class ArrayDemo4 {
	public static void main(String[] args) {
		// for-loop 與 for-each 的選擇
		// 若要改變元素內容, 需使用 for-loop, 因為有 [i] (維度) 可以指定
		int[] scores = {50, 90, 80};
		System.out.println(Arrays.toString(scores));
		
		// 每一個分數都要加 5 分
		//scores[0] += 5; // scores[0] = scores[0] + 5;
		//scores[1] += 5;
		//scores[2] += 5;
		for(int i=0;i<scores.length;i++) {
			scores[i] += 5;
		}
		System.out.println(Arrays.toString(scores));
	}
}
