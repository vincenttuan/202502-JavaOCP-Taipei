package day02;

// 存(deposit)提(withdraw)款, 查餘額
public class MyBank {
	
	// 帳戶餘額
	private static int balance = 10000; 
	
	public static void main(String[] args) {
		

	}
	
	private static void deposit(int amount) {
		balance += amount;
		System.out.printf("存款 $%d%n", amount);
	}
	
	private static void withdraw(int amount) {
		balance -= amount;
		System.out.printf("提款 $%d%n", amount);
	}
	
	private static void printBalance(int amount) {
		System.out.printf("餘額 $%d%n", balance);
	}

}
