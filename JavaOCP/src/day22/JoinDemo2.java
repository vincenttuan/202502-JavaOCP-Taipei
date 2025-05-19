package day22;

// 模擬工廠的三個步驟
// 1.準備材料 -> 2.製作產品 -> 3.包裝出貨 
public class JoinDemo2 {

	public static void main(String[] args) {
		Runnable p1 = () -> {
			System.out.println("1.1 準備材料中...");
			System.out.println("1.2 材料準備完成");
		};
		Runnable p2 = () -> {
			System.out.println("2.1 開始製作產品...");
			System.out.println("2.2 產品製作完成");
		};
		Runnable p3 = () -> {
			System.out.println("3.1 包裝出貨中...");
			System.out.println("3.2 出貨完成");
		};
		
		Thread prepare = new Thread(p1);
		Thread produce = new Thread(p2);
		Thread pack = new Thread(p3);
		
		prepare.start();
		produce.start();
		pack.start();

	}

}
