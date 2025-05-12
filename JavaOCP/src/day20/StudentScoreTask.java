package day20;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentScoreTask implements Runnable {
	private String fileName;
	
	public StudentScoreTask(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void run() {
		// 讀檔
		try {
			String content = Files.readString(Path.of(fileName)); // 字串: 100,90,80,70,60
			String[] array = content.split(","); // 字串陣列: ["100","90","80","70","60"]
			int[] scores = Stream.of(array)
								 .mapToInt(score -> Integer.parseInt(score))
								 .toArray(); // int 陣列: [100,90,80,70,60]
			// 統計物件
			IntSummaryStatistics stat = IntStream.of(scores).summaryStatistics();
			// 總分
			long sum = stat.getSum();
			// 平均
			double avg = stat.getAverage();
			
			System.out.printf("總分:%d 平均:%.1f%n", sum, avg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
