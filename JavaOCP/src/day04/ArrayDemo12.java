package day04;

public class ArrayDemo12 {
	public static void main(String[] args) {
		// 硬幣有 50, 10, 5, 1 四種
		// 若有 100 元買了飲料 23 元
		// 試問要找多少錢 ? 如何找 ?
		int totalChange = 100 - 23; // 元
		int[] coins = {50, 10, 5, 1}; // 硬幣面額
		int[] count = {0, 0, 0, 0}; // 各硬幣的數量
		
		
		
		
		System.out.printf("找 %d 元%n", totalChange);
		for(int i=0;i<coins.length;i++) {
			System.out.printf("%d 元 %d 枚\n", coins[i], count[i]);
		}
		
	}
}
