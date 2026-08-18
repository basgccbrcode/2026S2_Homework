package lesson12;

public class Animal {
	protected String name = "";
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println("*Animal sounds*");
	}
	
	// only use static for utility methods, not the instance
	public static void food() {
		System.out.println("*Animal eats*");

	}

	public String getName() {
		return this.name;
	}
}
