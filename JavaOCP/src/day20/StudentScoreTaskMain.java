package day20;

public class StudentScoreTaskMain {

	public static void main(String[] args) {
		StudentScoreTask task1 = new StudentScoreTask("src/day20/A01.txt");
		StudentScoreTask task2 = new StudentScoreTask("src/day20/A02.txt");
		StudentScoreTask task3 = new StudentScoreTask("src/day20/A03.txt");
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);
		
		t1.start();
		t2.start();
		t3.start();
		
		// 請問這3個學生總分加總為何 ?
		// 必須等到 t1, t2, t3 都執行完畢之後能執行以下程式碼
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			
		}
		
		long total = task1.getSum() + task2.getSum() + task3.getSum();
		System.out.printf("Total: %d%n", total);

	}

}
