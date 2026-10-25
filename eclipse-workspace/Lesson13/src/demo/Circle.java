package demo;

public class Circle extends Shape {

	private double radius;
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
		
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;	
	}
	
}
