package day26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 洗衣服務, 負責處理非同步洗衣任務
public class ClothesService {
	
	private ExecutorService executorService;
	
	// count: 洗衣機(執行緒)的數量
	public ClothesService(int count) {
		executorService = Executors.newFixedThreadPool(count);
	}
	
	// 洗衣服務
	public Clothes service(Clothes dirtyClothes) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dirtyClothes.wash(); // 洗衣完成
		System.out.println(dirtyClothes + " 洗好了, 可以通知顧客來取!");
		return dirtyClothes;
	}
	
	// 非同步送洗衣服, 回傳 Future 做為取衣單
	public Future<Clothes> serviceAsync(Clothes dirtyClothes) {
		System.out.println(dirtyClothes + " 送來洗衣店, 開始洗衣...");
		// 提交洗衣服務
		return executorService.submit(() -> service(dirtyClothes));
	}
	
	
}
