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
		System.out.printf("存款 $%d%n", amount);
	}
	
	public static void withdraw(int amount) {
		balance -= amount;
		System.out.printf("提款 $%d%n", amount);
	}
	
	public static void printBalance() {
		System.out.printf("餘額 $%d%n", balance);
	}

}
