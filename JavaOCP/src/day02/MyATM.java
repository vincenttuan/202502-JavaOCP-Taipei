package day02;

import java.util.Scanner;

public class MyATM {
	
	private static boolean stop; // 預設 false
	
	public static void main(String[] args) {
		
		while (!stop) {
			menu();
			action();
		}
		
	}
	
	// 選單
	public static void menu() {
		System.out.println("+-------------+");
		System.out.println("|     ATM     |");
		System.out.println("+-------------+");
		System.out.println("| 1. Deposit  |");
		System.out.println("| 2. Withdraw |");
		System.out.println("| 3. Print    |");
		System.out.println("| 4. Transfer |"); // 轉帳/匯款
		System.out.println("| 0. Exit     |");
		System.out.println("+-------------+");
		System.out.print("choice => ");
	}
	
	// 操作
	public static void action() {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt(); // 1, 2, 3, 或 0
		int amount = 0; // 存提款金額
		switch (choice) {
			case 1: // Deposit(存款)
				System.out.print("請輸入存款金額: ");
				amount = sc.nextInt();
				MyBank.deposit(amount);
				break;
			case 2: // Withdraw(提款)
				System.out.print("請輸入提款金額: ");
				amount = sc.nextInt();
				MyBank.withdraw(amount);
				break;
			case 3: // Print(列印目前餘額)
				MyBank.printBalance();
				break;
			case 4: // Transfer(轉帳)
				System.out.print("請輸入轉帳金額");
				amount = sc.nextInt();
				MyBank.transfer(amount);
				break;
			case 0: // Exit(離開)
				System.out.println("離開 ATM, 系統結束");
				//System.exit(0); // 強制離開系統
				stop = true;
				break;	
			default:
				System.out.println("選擇錯誤, 請重新選擇!");
				action(); // 重新執行 action(); 這邊是遞迴邏輯操作使用上要小心
		}
	}
	
}
