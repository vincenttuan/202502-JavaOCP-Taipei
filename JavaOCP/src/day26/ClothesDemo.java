package day26;

import java.util.concurrent.Future;

public class ClothesDemo {

	public static void main(String[] args) throws Exception {
		ClothesService service = new ClothesService(3); // 3 台洗衣機
		
		// 模擬 5 位顧客送洗衣服
		Clothes[] clothes = {
				new Clothes("小明"), new Clothes("小華"), new Clothes("小美"), 
				new Clothes("小強"), new Clothes("小英")
		};
		
		// 存放每位顧客的取衣單(Future物件)
		Future<Clothes>[] tickets = new Future[clothes.length];
		
		// 顧客送洗衣服, 取得洗衣單
		for(int i=0;i<clothes.length;i++) {
			tickets[i] = service.serviceAsync(clothes[i]);
		}
		
		System.out.println("顧客們離開去做其他事情...");
		
		// 模擬顧客做其他事 
		Thread.sleep(500);
		System.out.println("顧客們正在上廁所,買菜,喝咖啡...");
		Thread.sleep(500);
		
		// 顧客回來領取衣服(等待洗衣完成)
		for(int i=0;i<tickets.length;i++) {
			Clothes clean = tickets[i].get(); // get() 會阻塞直到衣服洗好
			System.out.println("顧客回來領取: " + clean);
		}
		
		// 關閉洗衣服務
		service.shutdown();
		System.out.println("程式結束~");
	}

}
