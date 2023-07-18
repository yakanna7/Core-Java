//Java example program to implement final variable & final class

package oops.finalkeyword;

final class Circle {

	final static double PI = 3.1415926; // final variable
	private double radius;
	private double area;
	private  double circumference;

	public Circle(double radius) {
		this.radius = radius;
		this.area = PI * radius * radius;
		this.circumference = 2 * PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.area = PI * radius * radius;
		this.circumference = 2 * PI * radius;
	}

	final double getArea() {
		return area;
	}

	final double getCircumference() {
		return circumference;
	}
}

public class FinalTest // extends Circle // not possible
{
	public static void main(String args[]) {

		Circle c = new Circle(4.5);

		System.out.println("Area of circle is " + c.getArea());
		System.out
				.println("Circumference of circle is " + c.getCircumference());
	}
}
