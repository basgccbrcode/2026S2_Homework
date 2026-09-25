package demo;

public class FactoryProblem {
	interface Animal {
		void speak();
	}
	
	static class Dog implements Animal {
		@Override
		public void speak() {
			System.out.println("woof");
		}
	}
	
	static class Cat implements Animal {
		@Override
		public void speak() {
			System.out.println("Meow!");
		}
	}
	
	static class Bunny implements Animal {
		@Override
		public void speak() {
			System.out.println("Tsl Tsl");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
