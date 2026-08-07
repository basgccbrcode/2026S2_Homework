package demo;

public class MethodDemo {

	public static void print(String stringToPrint) {
		System.out.println(stringToPrint);
	}
	
	// int version. method overloading
	public static void print(int intToPrint) {
		System.out.println(intToPrint);
	}
	
	public void nonStaticPrint(String stringToPrint) {
		System.out.println(stringToPrint);

	}
	
	public static void main(String[] args) {
		print("Hello. I'm learning Java");
		MethodDemo md = new MethodDemo();
		md.nonStaticPrint("hello non static");
	}

}