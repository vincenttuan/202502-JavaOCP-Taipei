package day24;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
	
	private CyclicBarrier cb1;
	private CyclicBarrier cb2;
	
	public Car(CyclicBarrier cb1, CyclicBarrier cb2) {
		this.cb1 = cb1;
		this.cb2 = cb2;
	}
	
	@Override
	public void run() {
		System.out.println("執行緒 " + Thread.currentThread().getName() + " 從台北出發");
		try {
			Thread.sleep(new Random().nextInt(5000));
			System.out.println("執行緒 " + Thread.currentThread().getName() + " 到台中了");
			cb1.await(); // 等待其他執行緒
			
			System.out.println("執行緒 " + Thread.currentThread().getName() + " 往高雄出發");
			Thread.sleep(new Random().nextInt(5000));
			System.out.println("執行緒 " + Thread.currentThread().getName() + " 到高雄了");
			cb2.await(); // 等待其他執行緒
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
