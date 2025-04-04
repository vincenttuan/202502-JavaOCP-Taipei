package day05;

public class MultiArray6 {

	public static void main(String[] args) {
		// 學校 -> 班級 -> 學生(成績)
		// [學校][班級][學生] = 成績
		int [][][] schools = {
				{ // 第一所學校 (index=0)
					{95, 88, 76}, // 班級一 (index=0) 
					{77, 66, 54}, // 班級二 (index=1)
					{94, 87, 90}  // 班級三 (index=2)
				},
				{ // 第二所學校 (index=1)
					{89, 100, 32}, // 班級一 (index=0)
					{66, 55, 44},  // 班級二 (index=1)
					{98, 91, 72}   // 班級三 (index=2)
				}
		};
		
		// 印出 100 分的成績
		System.out.println(schools[1][0][1]);
		
		// 所有成績加總 ?
		int sum = 0;
		int count = 0;
		for(int[][] school : schools) {
			for(int[] classes : school) {
				for(int score : classes) {
					sum += score;
					count++;
				}
			}
		}
		System.out.printf("成績總和: %,d%n", sum);
		System.out.printf("成績平均: %,d%n", sum/count);
		System.out.printf("成績平均: %,.2f%n", (double)sum/count);
	}

}
