package day24;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
	
	private CyclicBarrier cyclicBarrier;
	
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		System.out.println("執行緒 " + Thread.currentThread().getName() + " 從台北出發");
		try {
			Thread.sleep(new Random().nextInt(5000));
			System.out.println("執行緒 " + Thread.currentThread().getName() + " 到台中了");
			cyclicBarrier.await(); // 等待其他執行緒
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("執行緒 " + Thread.currentThread().getName() + " 往高雄出發");
	}
	
}
