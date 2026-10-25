package lesson15q1;

public class Student {
	public static int count = 0;
	
	public Student() {
		count++;
}
	
	public static void showStudents() {
		System.out.println("total students created: " + count);

	}
	
	public static void showInstance() {
		System.out.println("instance method");

	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student.showStudents();
		s1.showInstance();

	}

}
