package day22;

import java.util.Random;

public class JoinDemo {
	static int high = 0;
	static int low = 0;
	
	public static void main(String[] args) throws Exception {
		Runnable r1 = () -> {
			Random random = new Random();
			high = random.nextInt(20) + 81; // 高標
			System.out.println("高標:" + high);
		};
		Runnable r2 = () -> {
			Random random = new Random();
			low = random.nextInt(20) + 31; // 低標
			System.out.println("低標:" + low);
		};
		
		Thread t1 = new Thread(r1); // 計算高標執行緒
		Thread t2 = new Thread(r2); // 計算低標執行緒
		System.out.println("t1 啟動");
		t1.start();
		System.out.println("t2 啟動");
		t2.start();
		
		// 等待 t1, t2 執行完畢才進行後續邏輯
		t1.join();
		t2.join();
		
		// 計算均標
		double avg = (high + low)/2.0;
		System.out.printf("均標:%.1f%n", avg);
		
	}

}
