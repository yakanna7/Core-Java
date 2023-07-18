//9.Java program to find area and perimeter of a rectangle
package basic;

import java.util.Scanner;

class Rectangle 
{
	public static void main(String[] args)
	{
		float length, breadth, area, perimeter;

		Scanner s = new Scanner(System.in);

		System.out.println("Eneter length and breadth of a Rectangle");
		length = s.nextFloat();
		breadth = s.nextFloat();

		area = length * breadth;
		perimeter = 2 * (length + breadth);

		System.out.println("Area of Rectangle is " + area);
		System.out.println("Perimeter of Rectangle is " + perimeter);
	}
}
