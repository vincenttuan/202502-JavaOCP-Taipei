package day22;

public class ATM {
	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(10_000);
		Runnable r1 = new Withdraw(account, 5000); // 提$ 5000 的工作
		Runnable r2 = new Withdraw(account, 4000); // 提$ 4000 的工作
		Runnable r3 = new Withdraw(account, 3000); // 提$ 3000 的工作
		
		Thread t1 = new Thread(r1, "小明");
		Thread t2 = new Thread(r2, "小華");
		Thread t3 = new Thread(r3, "小英");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
