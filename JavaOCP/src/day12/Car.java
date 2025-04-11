package day12;

// 汽車-外部類別
public class Car {
	
	// 啟動引擎
	public void startEngine1() {
		System.out.println("啟動1");
		// 引擎-方法內部類別
		class Engine {
			void run() {
				System.out.println("4缸引擎運轉");
			}
		}
		// 建立引擎物件
		Engine engine = new Engine();
		engine.run();
	}
	// 啟動引擎
	public void startEngine2() {
		System.out.println("啟動2");
		// 引擎-方法內部類別
		class Engine {
			void run() {
				System.out.println("2缸引擎運轉");
			}
		}
		// 建立引擎物件
		Engine engine = new Engine();
		engine.run();	
	}
	
	
	
}
