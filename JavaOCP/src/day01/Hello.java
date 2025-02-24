package day01;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入次數:");
		int count = sc.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println(i + " Hello 哈囉 Java 爪哇 ~");
		}
		sc.close();
		
	}

}
