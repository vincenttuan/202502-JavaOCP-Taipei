package day02;

// 存(deposit)提(withdraw)款, 查餘額
public class MyBank {
	
	// 帳戶餘額
	private static int balance = 0; 
	
	public static void main(String[] args) {
		

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
