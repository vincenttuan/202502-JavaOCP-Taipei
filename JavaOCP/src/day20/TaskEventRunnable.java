package day20;

public class TaskEventRunnable implements Runnable {
	private TaskEven taskEven;
	
	public TaskEventRunnable(TaskEven taskEven) {
		this.taskEven = taskEven;
	}
	
	// 執行緒透過 start() 啟動時會自動執行 run() 方法裡面的任務
	@Override
	public void run() {
		taskEven.job();
	}

}
