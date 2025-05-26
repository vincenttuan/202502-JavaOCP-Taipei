package day24;

import java.util.concurrent.CyclicBarrier;

public class CarDemo {
	public static void main(String[] args) {
		Runnable lunch = () -> System.out.println("吃午餐囉~~");
		int n = 3;
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(n, lunch);
		new Thread(new Car(cyclicBarrier), "A車").start();
		new Thread(new Car(cyclicBarrier), "B車").start();
		new Thread(new Car(cyclicBarrier), "C車").start();
		
	}
}
