package main;

public class BasicMethods {
	
	public static int add (int x, int y) {
		return x + y;
	}
		
	public static String greet(String name) {
		return "How are you" + name;
	}

	public static void main(String[] args) {
		int sum = add(6, 12);
		System.out.println("the sum is " + sum);
		
		String message = greet(" Bas");
		System.out.println(message);
		}
	
	}
