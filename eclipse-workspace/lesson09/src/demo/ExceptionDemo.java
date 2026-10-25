package demo;

import java.io.IOException;
import java.util.Scanner;

/*
* errors and exceptions
* throwable
*
* Exceptions
* checked (like IOException)
*
*
*
*
*/

public class ExceptionDemo {

	public static void main(String[] args) {
		int[] Numberarray = {0,1};
		
		// double result = Numberarray[1] / Numberarray[0];
		double result;

		
		try {
			result = Numberarray[1] / Numberarray[0];
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("name: ");
		String personInt = scanner.nextLine();
		
		try {
		nameCheck(personInt);
	} catch (BadNameException e) {
		System.out.println(e.getMessage());}
	}

	private static void nameCheck(String personInt) throws BadNameException {
		if (personInt.isEmpty()) {
			throw new BadNameException("No name provided - empty");
		}
		else if (personInt.equals("Dave")) {
			throw new BadNameException("name is funny");
		}
	} 
	
	static class BadNameException extends Exception {
		BadNameException(String message) {
			super(message);
		}
	}

}
