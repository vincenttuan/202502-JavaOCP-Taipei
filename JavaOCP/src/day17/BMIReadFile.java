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
					//--------------------------------------------------------------
					double h = Double.parseDouble(height); // 字串轉double
					double w = Double.parseDouble(weight); // 字串轉double
					double bmi = w / Math.pow(h/100, 2);
					System.out.printf("姓名:%s 身高:%.1f 體重:%.1f BMI:%.2f%n", 
							name, h, w, bmi);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println(line + " ==> 分析錯誤(" + e.getMessage() + ")");
				} catch (NumberFormatException e) {
					System.err.println(line + " ==> 資料轉換錯誤(" + e.getMessage() + ")");
				}
			}
		} catch (IOException e) {
			System.err.println("讀檔錯誤:" + e);
		}

	}

}
