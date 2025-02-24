package day01;

import java.util.Scanner;

public class Guess1 {

	public static void main(String[] args) {
		// 1~9 猜數字
		int ans = 7;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入數字:");
			int userGuess = sc.nextInt();
			// 判斷
			if(userGuess > ans) {
				System.out.println("猜大了");
			} else if(userGuess < ans) {
				System.out.println("猜小了");
			} else {
				System.out.println("答對了");
				break;
			}
		} while(true);
		

	}

}
