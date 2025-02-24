package day01;

import java.util.Random;
import java.util.Scanner;

public class Guess2 {

	public static void main(String[] args) {
		Random rand = new Random();
		// 剪刀石頭布, 三戰二勝
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("剪刀(2)石頭(0)布(1):");
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
			} else {
				System.out.println("電腦贏");
			}
			
		} while(true);

	}

}
