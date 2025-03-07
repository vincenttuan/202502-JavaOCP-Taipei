package day03;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = new int[5];
		//     scores -> [0, 0, 0, 0, 0] 有初始值
		// 維度 index  ->  0  1  2  3  4 
		// 長度 length = 5
		// 最小維度 = 0
		// 最大維度 = 4 (5-1) 公式: 陣列長度 length - 1
		// 給定資料 scores[0] = 90;
		
		scores[0] = 90;
		scores[1] = 100;
		scores[2] = 50;
		scores[3] = 70;
		scores[4] = 35;
		
		System.out.println(scores); // [I@65ae6ba4: "["(一維陣列) "I"(整數) @(在) "65ae6ba4"(雜湊值)
		System.out.println(scores.length);
		System.out.println(scores[0] + ", " + scores[1] + ", " + scores[2] + ", " + scores[3] + ", " + scores[4]);
		
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i] + ", ");
		}
		System.out.println();
		
	}

}
