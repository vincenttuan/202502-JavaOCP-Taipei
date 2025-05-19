package day22;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 提款服務
	public void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		int currentBalance = balance; // 取得帳戶餘額
		System.out.printf("%s 要提款$%,d 目前帳戶餘額$%,d %n", tName, amount, currentBalance);
		// 模擬提款時會花費的時間
		for(int i=0;i<Integer.MAX_VALUE;i++);
		
		if(currentBalance >= amount) {
			currentBalance -= amount; // 減去提款金額
			this.balance = currentBalance; // 更新目前餘額
			System.out.printf("%s 要提款$%,d (成功) 目前帳戶餘額$%,d %n", tName, amount, currentBalance);
		} else {
			System.out.printf("%s 要提款$%,d (失敗) 目前帳戶餘額$%,d %n", tName, amount, currentBalance);
		}
		
	}
}
