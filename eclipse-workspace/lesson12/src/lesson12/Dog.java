package lesson12;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Woof woof!");
	}
	
	public String getName() {
		return super.name;
	}
	
	public static void main(String[] args) {
		Dog d = new Dog("Jess");
		System.out.printf("Spawned: %s\n", d.getName());
		d.makeSound();
		d.food();
		Cat c = new Cat("Penelope");
		System.out.printf("Spawned: %s\n", c.getName());
		c.makeSound();
		
		Animal[] arr = {d, c};
		for (Animal a: arr) {
			a.food();
			a.makeSound();
	}
	
	Animal a1 = new Dog("Luna");
	((Dog) a1).food();
	
	}
	
}
