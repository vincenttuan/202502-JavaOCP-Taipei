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
		double totalRrevenue = 0;
		// 銷售額最高的 id
		double highestId = 0;
		// 銷售額最高的金額
		double highestRevenue = 0;
				
		for(double[] item : menu) {
			double revenue = item[1] * item[2]; // 計算銷售額
			// 判斷銷售額是否大於最高銷售額
			if(revenue > highestRevenue) {
				highestRevenue = revenue;
				highestId = item[0];
			}
			// 印出每一個商品的銷售紀錄
			System.out.printf("餐點id:%.0f 單價:%,.0f 銷售量:%,.0f 銷售額:%,.0f%n", 
					item[0], item[1], item[2], revenue);
			totalRrevenue += revenue; // 銷售額累計
		}
		// 全店的總銷售額 ?
		System.out.printf("全店的總銷售額:%,.0f%n", totalRrevenue);
		
		// 哪一個商品銷售額最高 ?
		System.out.printf("哪一個商品銷售額最高:%.0f(%s) 銷售額:%,.0f%n", 
				highestId, getItemName(highestId), highestRevenue);

	}
	
	public static String getItemName(double itemId) {
		switch ((int)itemId) {
			case 101: return "鐵板牛肉堡";
			case 102: return "雞塊套餐";
			case 103: return "雙層起司堡";
			case 104: return "炸雞腿堡";
			case 105: return "薯條套餐";
			default: return "未知餐點";
		}
	}

}
