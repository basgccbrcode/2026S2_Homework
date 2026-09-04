package demo;

public class ThreadDemo {
	
	public static class CountingTask implements Runnable {
		
		private final String taskName;
		private final int delayMilliseconds;
		
		CountingTask(String taskName, int delayMilliseconds) {
			this.taskName = taskName;
			this.delayMilliseconds = delayMilliseconds;
		}
		
		public void run() {
			for (int count = 1; count <= 3; count++) {
				System.out.printf("%s: count=%d, running on %s\n", taskName, count, Thread.currentThread().getName());
			}
			
			try {
				Thread.sleep(delayMilliseconds);
			} catch (InterruptedException exception) {
				Thread.currentThread().interrupt();
				System.out.println(taskName + "interrupted. Stopping");
				return;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main thread: " + Thread.currentThread().getName());
		
		Thread t1 = new Thread(new CountingTask("FAST", 100), "t1");
		Thread t2 = new Thread(new CountingTask("SLOW", 200), "task2");
		Thread t3 = new Thread(new CountingTask("SLOWEST", 3200), "task3");

		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException exception) {
			Thread.currentThread().interrupt();
			System.out.println("Main Thread interrupted. Stopping");
			return;
	}
		
		System.out.println("All workers have finished!");	
	}

}
