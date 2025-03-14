package day05;

import java.lang.management.PlatformLoggingMXBean;

public class MultiArray5 {

	public static void main(String[] args) {
		// 5種餐點 {餐點 id(品名), 單價, 銷售量} 的資料如下:
		double[][] menu = {
				{101, 50.0, 150}, // 餐點 id (鐵板牛肉堡), 單價 50 元, 銷售量 150
				{102, 45.0, 200}, // 餐點 id (雞塊套餐), 單價 45 元, 銷售量 200
				{103, 80.0, 120}, // 餐點 id (雙層起司堡), 單價 80 元, 銷售量 120
				{104, 55.0, 180}, // 餐點 id (炸雞腿堡), 單價 55 元, 銷售量 180
				{105, 40.0, 220}, // 餐點 id (薯條套餐), 單價 40 元, 銷售量 220
		};
		
		// 用來累計每一個餐點的銷售額
		double totalSales = 0;
		
		for(double[] item : menu) {
			double sales = item[1] * item[2]; // 計算銷售額
			// 印出每一個商品的銷售紀錄
			System.out.printf("餐點id:%.0f 單價:%,.0f 銷售量:%,.0f 銷售額:%,.0f%n", 
					item[0], item[1], item[2], sales);
			totalSales += sales; // 銷售額累計
		}
		// 全店的總銷售額 ?
		System.out.printf("全店的總銷售額:%,.0f%n", totalSales);
		
		// 哪一個商品銷售額最高 ?

	}

}
