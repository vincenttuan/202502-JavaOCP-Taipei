package day20;

public class TaskOdd {
	
	public void job() {
		// 取得執行緒名稱:
		String tname = Thread.currentThread().getName();
		// 執行 1~1000 的迴圈
		for(int i=1;i<=1000;i+=2) {
			System.out.printf("%s 執行: %d%n", tname, i);
		}
	}
	
}
