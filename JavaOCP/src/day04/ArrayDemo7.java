package day04;

public class ArrayDemo7 {
	public static void main(String[] args) {
		int[] scores1 = {50, 90, 20, 80};
		int[] scores2 = {75, 100, 45, 65};
		// 請求出最高分 = ?
		// 答案: 100
		int max = scores1[0];
		
		for(int score : scores1) {
			if(score > max) {
				max = score;
			}
		}
		//System.out.println(max);
		
		for(int score : scores2) {
			if(score > max) {
				max = score;
			}
		}
		
		System.out.println(max);
		
		
		
	}
}
