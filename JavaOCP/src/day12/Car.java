package day12;

public class Car {
	
	// 啟動引擎
	public void startEngine() {
		System.out.println("啟動");
		// 引擎方法內部類別
		class Engine {
			void run() {
				System.out.println("引擎運轉");
			}
		}
		// 建立引擎物件
		Engine engine = new Engine();
		engine.run();
	}
	
}
