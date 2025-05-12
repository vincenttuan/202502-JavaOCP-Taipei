package day20;

public class Runner implements Runnable {
	private String name;
	
	public Runner(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.printf("%s 開始跑步%n", name);
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑到第 %d 公尺%n", name, i);
		}
		System.out.printf("%s 到達終點了%n", name);
	}
}
