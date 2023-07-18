//10.Java program to find area and perimeter of a square
package basic;

import java.util.Scanner;

class Square 
{
	public static void main(String[] args) 
	{
		float side, area, perimeter;

		Scanner s = new Scanner(System.in);

		System.out.println("Eneter side value of a Square");
		side = s.nextFloat();

		area = side * side;
		perimeter = 4 * side;

		System.out.println("Area of Square is " + area);
		System.out.println("Perimeter of Square is " + perimeter);
	}
}
