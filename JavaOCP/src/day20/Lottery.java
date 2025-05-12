package day20;

import java.util.List;
import java.util.Random;

// 樂透機
public class Lottery implements Runnable {
	private Integer num;
	private List<Integer> list;
	
	public Lottery(Integer num, List<Integer> list) {
		this.num = num;
		this.list = list;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		System.out.printf("%d 樂透機啟動%n", num);
		// 模擬樂透機處理時間
		try {
			Thread.sleep(random.nextInt(2000)); // 模擬暫停時間 0~1999 ms
			int lottoNumber = random.nextInt(100); // 0~99
			System.out.printf("%d 樂透機選出 %d 號%n", lottoNumber);
			// 將樂透號碼注入到 list
			list.add(lottoNumber);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
