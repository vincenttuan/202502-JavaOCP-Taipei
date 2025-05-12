package day20;

import java.util.List;

public class Runner implements Runnable {
	private String name;
	private List<String> list;
	public Runner(String name, List<String> list) {
		this.name = name;
		this.list = list;
	}
	
	@Override
	public void run() {
		System.out.printf("%s 開始跑步%n", name);
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑到第 %d 公尺%n", name, i);
		}
		System.out.printf("%s 到達終點了%n", name);
		// 記錄到到排名表
		list.add(name);
	}
}
