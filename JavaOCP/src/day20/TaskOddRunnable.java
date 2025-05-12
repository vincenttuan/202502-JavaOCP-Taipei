package day20;

public class TaskOddRunnable implements Runnable {
	private TaskOdd taskOdd;
	
	public TaskOddRunnable(TaskOdd taskOdd) {
		this.taskOdd = taskOdd;
	}
	
	// 執行緒透過 start() 啟動時會自動執行 run() 方法裡面的任務
	@Override
	public void run() {
		taskOdd.job();
	}

}
