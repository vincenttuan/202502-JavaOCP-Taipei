package day16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) throws Exception {
		// 路徑
		Path filePath = Path.of("src/day16/100m.csv");
		if(!Files.exists(filePath)) {
			System.out.println(filePath + " 檔案不存在!");
			return;
		}
		System.out.println(filePath + " 檔案存在!");
		// 將資料讀取並匯入到 List
		List<String> lines = Files.readAllLines(filePath);
		System.out.println(lines);
		// 印出每一筆資料
		for(String line : lines) {
			System.out.println(line);
			// 利用 split 來切分資料
			String[] array = line .split(",");
			String name = array[0];
			double score1 = Double.parseDouble(array[1]);
			double score2 = Double.parseDouble(array[2]);
			double score3 = Double.parseDouble(array[3]);
			double score4 = Double.parseDouble(array[4]);
			double score5 = Double.parseDouble(array[5]);
			double avg = (score1+score2+score3+score4+score5) / 5;
			System.out.printf("姓名: %s 成績: %.2f %.2f %.2f %.2f %.2f 平均: %.2f%n%n",
					name, score1, score2, score3, score4, score5, avg);
		}
		
	}

}
