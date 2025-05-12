package day20;

public class TaskMain {
	
	public static void main(String[] args) {
		TaskOdd taskOdd = new TaskOdd();
		TaskEven taskEven = new TaskEven();
		// 單工模式
		//taskOdd.job();
		//taskEven.job();
		
		// 多執行緒模式
		Thread t1 = new Thread(new TaskOddRunnable(taskOdd));
		Thread t2 = new Thread(new TaskEventRunnable(taskEven));
		t1.start();
		t2.start();
	}
	
}
