package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RunnerMain {

	public static void main(String[] args) {
		// 排名表
		List<String> list = new CopyOnWriteArrayList<>();
		// 建立跑者
		Runner r1 = new Runner("小明", list);
		Runner r2 = new Runner("小華", list);
		Runner r3 = new Runner("小英", list);
		// 建立執行緒
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		// 執行
		t1.start();
		t2.start();
		t3.start();
	}

}
