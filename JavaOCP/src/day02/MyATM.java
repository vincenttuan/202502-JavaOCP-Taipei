package day02;

import java.util.Scanner;
import static java.lang.System.out;

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
		out.println("+-------------+");
		out.println("|     ATM     |");
		out.println("+-------------+");
		out.println("| 1. Deposit  |");
		out.println("| 2. Withdraw |");
		out.println("| 3. Print    |");
		out.println("| 4. Transfer |"); // 轉帳/匯款
		out.println("| 0. Exit     |");
		out.println("+-------------+");
		out.print("choice => ");
	}
	
	// 操作
	public static void action() {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt(); // 1, 2, 3, 或 0
		int amount = 0; // 存提款金額
		switch (choice) {
			case 1: // Deposit(存款)
				out.print("請輸入存款金額: ");
				amount = sc.nextInt();
				MyBank.deposit(amount);
				break;
			case 2: // Withdraw(提款)
				out.print("請輸入提款金額: ");
				amount = sc.nextInt();
				MyBank.withdraw(amount);
				break;
			case 3: // Print(列印目前餘額)
				MyBank.printBalance();
				break;
			case 4: // Transfer(轉帳)
				out.print("請輸入轉帳金額: ");
				amount = sc.nextInt();
				MyBank.transfer(amount);
				break;
			case 0: // Exit(離開)
				out.println("離開 ATM, 系統結束");
				//System.exit(0); // 強制離開系統
				stop = true;
				break;	
			default:
				out.println("選擇錯誤, 請重新選擇!");
				action(); // 重新執行 action(); 這邊是遞迴邏輯操作使用上要小心
		}
	}
	
}
