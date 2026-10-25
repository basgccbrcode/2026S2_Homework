package practicetasks;

public class ExceptionIntro {
	public static void main(String[] args) {
	int[] Numberarray = {0,1,2};
	
	// double result = Numberarray[1] / Numberarray[0];
	double result;

	
	try {
		result = Numberarray[1] / Numberarray[0];
	} catch (ArithmeticException ae) {
		System.out.println(ae.getMessage());
}
	}
}
