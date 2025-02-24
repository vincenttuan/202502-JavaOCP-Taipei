package day01;

import java.util.Scanner;
import java.util.Random;

public class Guess1 {

	public static void main(String[] args) {
		// 1~9 猜數字
		Random rand = new Random();
		int ans = rand.nextInt(9) + 1; // 0~8 + 1 => 1~9
		int min = 0, max = 10;
		int userWinCount = 0, pcWinCount = 0; // 使用者與pc贏的次數
		// 三戰二勝
		for(int i=1;i<=3;i++) {
			// 判斷是否有人達到 2 勝
			if(userWinCount == 2 || pcWinCount == 2) {
				break;
			}
			System.out.printf("第 %d 回合%n", i);
			do {
				// 使用者猜:
				Scanner sc = new Scanner(System.in);
				System.out.printf("請輸入數字(%d ~ %d)之間:", min, max);
				int userGuess = sc.nextInt();
				// 判斷
				if(userGuess > ans) {
					System.out.println("猜大了");
					max = userGuess;
				} else if(userGuess < ans) {
					System.out.println("猜小了");
					min = userGuess;
				} else {
					System.out.println("玩家答對了");
					userWinCount++; // 玩家贏的次數 + 1
					break;
				}
				//--------------------------------------------------
				// 電腦猜
				int pcGuess = rand.nextInt(max-min-1) + 1 + min;
				System.out.printf("電腦猜:%d%n", pcGuess);
				// 判斷
				if(pcGuess > ans) {
					System.out.println("猜大了");
					max = pcGuess;
				} else if(pcGuess < ans) {
					System.out.println("猜小了");
					min = pcGuess;
				} else {
					System.out.println("電腦答對了");
					pcWinCount++; // 電腦贏的次數 + 1
					break;
				}
				
			} while(true);
			
		}
		
		// 最終判斷
		String winner = userWinCount > pcWinCount ? "玩家" : "電腦";
		System.out.printf("最終判斷 %s 贏了%n", winner);
		
		
	}
}













