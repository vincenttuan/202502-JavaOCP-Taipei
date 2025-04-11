package day12;

// 汽車-外部類別
public class Car {
	
	// 啟動引擎
	public void startEngine() {
		System.out.println("啟動");
		// 引擎-方法內部類別
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
