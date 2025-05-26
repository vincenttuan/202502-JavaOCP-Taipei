package day24;

import java.util.concurrent.CyclicBarrier;

public class CarDemo {
	public static void main(String[] args) throws Exception {
		Runnable lunch = () -> System.out.println("吃午餐囉~~");
		Runnable dinner = () -> System.out.println("吃晚餐囉~~");
		
		CyclicBarrier cb1 = new CyclicBarrier(2, lunch);
		CyclicBarrier cb2 = new CyclicBarrier(4, dinner);
		new Thread(new Car(cb1, cb2), "A車").start();
		new Thread(new Car(cb1, cb2), "B車").start();
		new Thread(new Car(cb1, cb2), "C車").start();
		new Thread(new Car(cb1, cb2), "D車").start();
		
	}
}
