package day22;

class Father implements Runnable {

	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯了");
		System.out.println("爸爸打電話叫瓦斯");
		// -------------------------------------------
		Thread worker = new Thread(new Worker());
		worker.start(); // 叫瓦斯工人送瓦斯
		// -------------------------------------------
		try {
			worker.join();
		} catch (Exception e) {
			
		}
		
		// -------------------------------------------
		System.out.println("爸爸開始洗熱水澡");
		System.out.println("爸爸洗完澡了");
	}
	
}

class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println("工人送瓦斯");
		System.out.println("工人在路上了");
		System.out.println("工人送瓦斯來了");
		System.out.println("工人將瓦斯安裝完畢了");
	}
	
}

public class Shower {

	public static void main(String[] args) {
		Thread father = new Thread(new Father());
		father.start();
	}

}
