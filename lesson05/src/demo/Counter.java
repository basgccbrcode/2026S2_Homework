package demo;

public class Counter {

	public static void main(String[] args) {
		System.out.println("While loop");
		int count = 0;
		while (count < 3) {
			System.out.println("count: " + count);
			++count;
		}

		System.out.println("for loop");
		for (int i = 1; i <= 20; i += 2) {
			System.out.println("Number for count: " + i);
			if (i == 14) {
				break;
			}
		}
		System.exit(0);
	}

}
