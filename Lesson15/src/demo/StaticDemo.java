package demo;

public class StaticDemo {

	public static int counter = 0;
	
	public StaticDemo() {
		StaticDemo.counter += 1;
	}
	
	public static void voidShowCounter(String[] args) {
		System.out.printf("you have %d instances in play!\n", args)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
