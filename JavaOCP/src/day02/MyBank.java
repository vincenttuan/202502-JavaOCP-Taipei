package day02;

// 存(deposit)提(withdraw)款, 查餘額
public class MyBank {
	
	// 帳戶餘額
	private static int balance = 0; 
	
	public static void main(String[] args) {
		printBalance(); // 查看餘額
		deposit(10000); // 存 10000
		printBalance(); // 查看餘額
		deposit(2000);  // 存 2000
		printBalance(); // 查看餘額
		withdraw(7000); // 提 7000
		printBalance(); // 查看餘額
		withdraw(6000); // 提 6000
		printBalance(); // 查看餘額
	}
	
	public static void deposit(int amount) {
		balance += amount;
		System.out.printf("存款成功 $%,d%n", amount);
	}
	
	public static void withdraw(int amount) {
		// 提款金額 > 0 && 提款金額 <= 目前餘額
		// 所以若 提款金額 <= 0 或 提款金額 > 目前餘額 都不能進行後續的提款動作
		if(amount <= 0) {
			System.out.printf("提款失敗 提款金額 $%,d 提款金額必須 > $0%n", amount);
			return; // 提前結束方法
		} else if (amount > balance) {
			System.out.printf("提款失敗 提款金額 $%,d > 目前餘額 $%,d%n", amount, balance);
			return; // 提前結束方法
		}
		
		balance -= amount;
		System.out.printf("提款成功 $%,d%n", amount);
	}
	
	public static void printBalance() {
		System.out.printf("餘額 $%,d%n", balance);
	}

}
