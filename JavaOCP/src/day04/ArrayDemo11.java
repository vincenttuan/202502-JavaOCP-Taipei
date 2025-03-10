package day04;

public class ArrayDemo11 {
	public static void main(String[] args) {
		// 硬幣有 50, 10, 5, 1 四種
		// 若有 100 元買了飲料 23 元
		// 試問要找多少錢 ? 如何找 ?
		// 答案:
		// 找 77 元
		// 50元 1 枚
		// 10元 2 枚
		// 5元 1 枚
		// 1元 2 枚
		int totalChange = 100 - 23;
		System.out.printf("找 %d 元%n", totalChange);
		// 如何找錢 ?
		// 50 元要找幾枚
		int fifty = totalChange / 50; // 77/50=1(枚)
		
		totalChange = totalChange % 50; // 77%50=27(剩餘)
		
		int ten = totalChange / 10; // 27/10=2(枚)
		
		totalChange = totalChange % 10; // 27%10=7(剩餘)
		
		int five = totalChange / 5; // 7/5=1(枚)
		
		totalChange = totalChange % 5; // 7%5=2(剩餘)
		
		int one = totalChange;
		
		System.out.printf("%d元 %d 枚%n", 50, fifty);
		System.out.printf("%d元 %d 枚%n", 10, ten);
		System.out.printf("%d元 %d 枚%n", 5, five);
		System.out.printf("%d元 %d 枚%n", 1, one);
	}
}
