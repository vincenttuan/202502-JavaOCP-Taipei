package day20;

public class TaskOddRunnable implements Runnable {
	private TaskOdd taskOdd;
	
	public TaskOddRunnable(TaskOdd taskOdd) {
		this.taskOdd = taskOdd;
	}
	
	@Override
	public void run() {
		taskOdd.job();
	}

}
