package day16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ReadCSV2 {
	
	public static void main(String[] args) throws Exception {
		// 你有一個 CSV 檔案（例如 100m.csv），其中包含了多位選手的姓名與他們在 100 公尺賽跑中的多次成績。
		// 你需要利用 Sportsman 這個 JavaBean 類別來讀取檔案並計算每一位選手的平均成績，並將結果列印出來。
		Path filePath = Path.of("src/day16/100m.csv");
		
		if(!Files.exists(filePath)) {
			System.out.println(filePath + " 檔案不存在!");
			return;
		}
		System.out.println(filePath + " 檔案存在!");
		
		List<Sportsman> sportsmans = Files.lines(filePath)
				//.map(line -> new Sportsman(line))
				.map(Sportsman::new)
				.collect(Collectors.toList());
		
		sportsmans.forEach(sportsman -> {
			System.out.printf("%s 平均: %.2f%n", sportsman.getName(), sportsman.getAverage());
		});
		
		// 找出全場最低的成績及對應的選手姓名
		double bestScore = Double.MAX_VALUE; // 最低的成績
		String bestName = null; // 選手姓名
		
		// 利用替換法
		for(Sportsman sportsman : sportsmans) {
			for(double score : sportsman.getScores()) {
				if(score < bestScore) {
					bestScore = score;
					bestName = sportsman.getName();
				}
			}
		}
		System.out.printf("跑最快的是 %s, 成績: %.2f 秒%n", bestName, bestScore);
	}

}
