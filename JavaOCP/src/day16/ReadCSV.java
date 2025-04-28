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
		
		
	}

}
