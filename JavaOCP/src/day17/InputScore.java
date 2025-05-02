package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScore {

	public static void main(String[] args) {
		// 使用者輸入成績之後系統判斷是否及格
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入成績:");
		try {
			int score = scanner.nextInt();
			if(score >= 60) {
				System.out.println("及格");
			} else {
				System.out.println("不及格");
			}
			System.out.println("程式結束!");
		} catch (InputMismatchException e) {
			System.out.println("輸入資料不正確, 請重新輸入 !");
			System.out.println(e);
		}
		
	}

}
