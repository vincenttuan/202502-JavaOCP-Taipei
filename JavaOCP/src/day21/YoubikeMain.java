package day21;

public class YoubikeMain {

	public static void main(String[] args) {
		// 每 30 秒執行一次
		Runnable runnable = () -> {
			System.out.println("Youbike 排程啟動(每 30 秒執行乙次):");
			while(true) {
				try {
					Thread.sleep(30_000); // 延遲 30 秒
					YoubikeUtil.refreshYoubike(); // Youbike 更新程式
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();

	}

}
