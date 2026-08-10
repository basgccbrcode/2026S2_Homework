package lesson8;

import java.util.Scanner;

public class IODemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter your name: ");
		String nameln = scanner.nextLine();
		System.out.println("you entered: " + nameln);

		
		System.out.print("enter your fav num");
		int numIn = scanner.nextInt();
		System.out.println("you entered: " + numIn);
		
		scanner.nextLine();
		
		System.out.println("enter your fav day");
		String dayIn = scanner.nextLine();
		System.out.println("you entered: " + dayIn);
		
		System.out.println("this is a\new line and this is a new t\tab");
	}

}
