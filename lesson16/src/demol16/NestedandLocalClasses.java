package demol16;

public class NestedandLocalClasses {

	static int i = 0;
	
	class MemberInner {
		void show() {
			System.out.println("Inner class");
		}
	}
	
	static class StaticInner {
		void show() {
			System.out.println("Inner class");
		}
	}
	
	void basMethod() {
		String st = "some string in basMethod()";
		
		System.out.println(st);
		
		class LocalInner {
			void show() {
				System.out.println("Local Inner class");
				System.out.printf("Value of st: %s\n", st);
			}
	}
		
		new LocalInner().show();
		
	}
	
	void useSecretive() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("inside secretive inner class");
			}
		};
		
		r.run();
	}
	
	
	public static void main(String[] args) {
		NestedandLocalClasses nlc = new NestedandLocalClasses();
		MemberInner mi = nlc.new MemberInner();
		mi.show();
		
		NestedandLocalClasses.StaticInner si = new StaticInner();
		si.show();
		
		nlc.basMethod();
		
		i = 3;
		// StaticInner si2 = new StaticInner();
	}

}
