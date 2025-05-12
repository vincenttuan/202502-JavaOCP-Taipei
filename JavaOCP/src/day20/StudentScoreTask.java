package day20;

import java.nio.file.Files;
import java.nio.file.Path;
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
			String content = Files.readString(Path.of(fileName));
			String[] array = content.split(",");
			int[] scores = Stream.of(array).mapToInt(score -> Integer.parseInt(score)).toArray();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
