package day01;

import java.util.Scanner;

public class Guess1 {

	public static void main(String[] args) {
		// 1~9 猜數字
		int ans = 7;
		int min = 0, max = 10;
		
		do {
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
				System.out.println("答對了");
				break;
			}
		} while(true);
		

	}

}
