package day04;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// for-loop 與 for-each 的選擇
		// 若要分析元素內容, 使用 for-each 較為方便
		int[] scores = {50, 90, 80};
		
		// 總分 = ?
		int sum = 0; // 負責將分數進行累加
		for(int score : scores) {
			sum += score; // 分數類加
		}
		System.out.printf("總分: %d%n", sum);

	}

}
