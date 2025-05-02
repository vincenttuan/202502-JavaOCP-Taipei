package day17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BMIReadFile {

	public static void main(String[] args) {
		// 讀取 bmi.csv 並計算出有效的 bmi 資料
		String filePath = "src/day17/bmi.csv";
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
			System.out.println("讀檔成功");
		} catch (IOException e) {
			System.out.println("讀檔錯誤:" + e);
		}

	}

}
