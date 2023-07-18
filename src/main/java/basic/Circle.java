//11.Java program to find area and circumference of a circle
package basic;

import java.util.Scanner;

class Circle 
{
	public static void main(String[] args)
	{
		double radius, area, circumference;

		Scanner s = new Scanner(System.in);

		System.out.println("Eneter radius of a Circle");
		radius = s.nextFloat();

		area = Math.PI * radius * radius;
		circumference = 2 * Math.PI * radius;

		System.out.println("Area of Circle is " + area);
		System.out.println("Circumference of Circle is " + circumference);
	}
}
