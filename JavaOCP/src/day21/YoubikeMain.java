package day21;

public class YoubikeMain {

	public static void main(String[] args) {
		// 每 30 秒執行一次
		Runnable runnable = () -> {
			while(true) {
				try {
					
					YoubikeUtil.refreshYoubike();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};

	}

}
