package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// 請撰寫一支 Java 程式，讓使用者從鍵盤輸入自己的「身高（公分）」與「體重（公斤）」，
		// 並計算出 BMI 值
		// 注意:當使用者輸入身高正確後，如果體重輸入錯誤，只需要重新輸入體重，不必重新輸入身高。
		Scanner scanner = new Scanner(System.in);
		double height = 0;
		double weight = 0;
		
		while(true) {
			try {
				// 身高輸入
				if(height == 0) {
					System.out.print("請輸入身高:");
					height = scanner.nextDouble();
					if(height <= 0) {
						height = 0;
						System.out.println("輸入錯誤請重新輸入");
						scanner.nextLine(); // 清空
						continue;
					}
				}
				
				// 體重輸入
				if(weight == 0) {
					System.out.print("請輸入體重:");
					weight = scanner.nextDouble();
					if(weight <= 0) {
						weight = 0;
						System.out.println("輸入錯誤請重新輸入");
						scanner.nextLine(); // 清空
						continue;
					}
				}
				
				if(height != 0 && weight != 0) {
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("輸入錯誤請重新輸入");
				scanner.nextLine(); // 清空
				continue;
			}
		}
		double bmi = weight / Math.pow(height/100, 2);
		System.out.println(bmi);
	}
}
