package lesson15q2;

public class MathUtil {

	public static int add(int a, int b) {
		return a + b;
	}
		
	public static int subtract(int a, int b) {
		return a - b;
	}
			
	public static int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		int sum = MathUtil.add(8, 1);
		int diff = MathUtil.subtract(8, 1);
		int prod = MathUtil.multiply(8, 1);
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference between 8 and 1: " + diff);
		System.out.println("Product of 8 times 1: " + prod);
	}
	
}
