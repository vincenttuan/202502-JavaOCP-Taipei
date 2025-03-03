package day02;

import java.util.Scanner;

public class MyATM {

	public static void main(String[] args) {
		
		menu();
		action();
		
	}
	
	// 選單
	public static void menu() {
		System.out.println("+-------------+");
		System.out.println("|     ATM     |");
		System.out.println("+-------------+");
		System.out.println("| 1. Deposit  |");
		System.out.println("| 2. Withdraw |");
		System.out.println("| 3. Print    |");
		System.out.println("| 0. Exit     |");
		System.out.println("+-------------+");
		System.out.println("choice => ");
	}
	
	// 操作
	public static void action() {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt(); // 1, 2, 3, 或 0
		switch (choice) {
			case 1: // Deposit(存款)
				
				break;
			case 2: // Withdraw(提款)
				
				break;
			case 3: // Print(列印目前餘額)
				
				break;
			case 0: // Exit(離開)
				
				break;	
			default:
				System.out.println("選擇錯誤, 請重新選擇!");
				action(); // 重新執行 action(); 這邊是遞迴邏輯操作使用上要小心
		}
	}
	
}
