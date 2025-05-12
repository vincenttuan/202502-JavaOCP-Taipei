package day20;

public class TaskEventRunnable implements Runnable {
	private TaskEven taskEven;
	
	public TaskEventRunnable(TaskEven taskEven) {
		this.taskEven = taskEven;
	}
	
	@Override
	public void run() {
		taskEven.job();
	}

}
