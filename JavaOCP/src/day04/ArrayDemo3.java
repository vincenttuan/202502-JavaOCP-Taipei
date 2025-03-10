package day04;

public class ArrayDemo3 {
	public static void main(String[] args) {
		int[] scores = {100, 90, 40, 70, 30};
		//               0    1   2   3   4
		System.out.printf("陣列長度: %d%n", scores.length);
		// 利用 for-loop 尋訪每一個元素
		for(int i=0;i<scores.length;i++) {
			System.out.printf("i=%d 內容 %d, ", i, scores[i]);
		}
		System.out.println();
		
		// 利用 for-each(in), 會自動走訪元素不用 i++
		// scores 是 int[] 所以每一個元素就是 int
		for(int score : scores) {
			System.out.println(score);
		}
		
		
	}
}
