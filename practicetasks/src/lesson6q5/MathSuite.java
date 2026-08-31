package lesson6q5;

public class MathSuite {
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double subtract(double a, double b) {
		return a - b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		double sum = add(6, 6);
		double product = multiply(6,6);
		double difference = subtract(6,6);
		
		System.out.println("The sum is: " + sum);
		System.out.println("The difference is: " + difference);
		System.out.println("The product is:  " + product);

	}

}
