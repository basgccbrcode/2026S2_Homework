package demo;

public class CounterComparsion {
	
	static class Counter {
		int count;
	
	public void increment() {
		count++;
	}
}

	private static final int INCREMENTS_PER_THREAD =
			1_000_000;
	
	static class UnsafeCounting extends Thread {
		private final Counter counter;
		
		UnsafeCounting(Counter counter) {
			this.counter = counter;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
