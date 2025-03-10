package day04;

public class ArrayDemo6 {
	public static void main(String[] args) {
		int[] scores = {50, 90, 20, 80};
		// 請印出最高分 = ?
		int max = scores[0]; // 假設 scores[0] 是最高分
		for(int i=1;i<scores.length;i++) {
			if(scores[i] > max) {
				max = scores[i]; // 替換掉最大值
			}
		}
		System.out.printf("最大值: %d%n", max);
		// 請印出最低分 = ?
		int min = scores[0];
		for(int score : scores) {
			if(score < min) {
				min = score;
			}
		}
		System.out.printf("最小值: %d%n", min);
	}
}
