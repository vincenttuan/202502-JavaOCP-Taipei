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
			for(String line : lines) {
				try {
					String[] array = line.split(",");
					String name = array[0]; // 姓名
					String height = array[1]; // 身高
					String weight = array[2]; // 體重
					System.out.printf("姓名:%s 身高:%s 體重:%s%n", name, height, weight);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println(line + " ==> 分析錯誤");
				}
			}
		} catch (IOException e) {
			System.out.println("讀檔錯誤:" + e);
		}

	}

}
