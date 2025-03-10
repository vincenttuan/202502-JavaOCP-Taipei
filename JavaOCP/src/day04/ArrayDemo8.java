package day04;

public class ArrayDemo8 {
	public static void main(String[] args) {
		int[] scores1 = {50,  90, 20, 80};
		int[] scores2 = {75, 100, 45, 65};
		//          i =   0   1    2   3
		// 請求出最高分 = ?
		// 答案: 100
		// 若二個陣列長度一樣可以一起比較
		int lens = scores1.length; // 因為 scores1.length 與 scores2.length 相同
		int max = scores1[0];
		for(int i=0;i<lens;i++) {
			if(scores1[i] > max) {
				max = scores1[i];
			}
			if(scores2[i] > max) {
				max = scores2[i];
			}
		}
		System.out.println(max);
	}
}
