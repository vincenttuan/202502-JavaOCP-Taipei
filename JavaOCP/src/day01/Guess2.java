package day01;

import java.util.Random;
import java.util.Scanner;

public class Guess2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int userWinCount = 0, pcWinCount = 0;
		for(int i=1;i<=3;i++) {
			if(userWinCount == 2 || pcWinCount == 2) {
				break;
			}
			System.out.printf("第 %d 回合 %n", i);
			
			// 剪刀石頭布, 三戰二勝
			do {
				Scanner sc = new Scanner(System.in);
				System.out.print("剪刀(2)石頭(0)布(1):");
				int userGuess = sc.nextInt();
				int pcGuess = rand.nextInt(3); // 0~2
				// 判讀出 ?
				System.out.printf("玩家出:%d 電腦出:%d%n", userGuess, pcGuess);
				// 判斷
				if(userGuess == pcGuess) {
					System.out.println("平手");
				} else if((userGuess == 0 && pcGuess == 2) || 
						  (userGuess == 2 && pcGuess == 1) ||
						  (userGuess == 1 && pcGuess == 0)) {
					System.out.println("玩家贏");
					break;
				} else {
					System.out.println("電腦贏");
					break;
				}
				
			} while(true);
			
		}
		
		String winner = (userWinCount > pcWinCount) ? "玩家" : "電腦";
		System.out.printf("最終判斷 %s 贏了%n", winner);
		
		
		

	}

}
