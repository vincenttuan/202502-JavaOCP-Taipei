package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScore2 {

	public static void main(String[] args) {
		// 使用者輸入成績之後系統判斷是否及格
		// 若輸入錯誤要請使用者重新輸入
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入成績:");
			try {
				int score = scanner.nextInt();
				if(score >= 60) {
					System.out.println("及格");
				} else {
					System.out.println("不及格");
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("輸入資料不正確, 請重新輸入 !");
				System.out.println(e);
				continue;
			} finally {
				System.out.println("程式結束!");
			}
		}

	}

}
