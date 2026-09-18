package demo;

public class RunnableStyles {
	
	private void demonstrateRunnableStyles() throws InterruptedException {
		Runnable anonymousClass = new Runnable() {

			@Override
			public void run() {
				System.out.println("anonymous class: " + Thread.currentThread().getName());
				System.out.println("this is: " + this.getClass().getName());
				
			}
		};
		startAndWait("anonymous thread", anonymousClass);
		
		Runnable lambda = () -> {
			System.out.println("lambda: " + Thread.currentThread().getName());
			System.out.println("this is" + getClass().getName());
		};
		startAndWait("Lambda thr", lambda);
	}

	public static void startAndWait(String name, Runnable task) throws InterruptedException {
		Thread thread = new Thread(task, name);
		thread.start();
		thread.join();

	}
	
	public static void main(String[] args)  throws InterruptedException {
		new RunnableStyles().demonstrateRunnableStyles();

	}

}
