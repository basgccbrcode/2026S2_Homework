package lesson12;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
	
	public String getName() {
		return super.name;
	}
	
	public static void main(String[] args) {

	}
	
}
