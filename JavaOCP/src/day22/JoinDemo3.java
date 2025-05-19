package day22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class JoinDemo3 {
	static int[] scores = new int[3];
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = () -> scores[0] = getScore("chinese.txt");
		Runnable r2 = () -> scores[1] = getScore("math.txt");
		Runnable r3 = () -> scores[2] = getScore("english.txt");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		// 等 t1, t2, t3 都執行完畢後才會執行接下來的程序
		t1.join();
		t2.join();
		t3.join();
		
		IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
		System.out.println(stat.getSum());
		System.out.println(stat.getAverage());
	}
	
	// 讀檔並轉 int
	public static int getScore(String fileName) {
		int score = 0;
		try {
			String content = Files.readString(Path.of("src/day22/" + fileName));
			score = Integer.parseInt(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return score;
	}

}
