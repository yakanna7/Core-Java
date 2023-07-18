//16.Java program to swap two numbers using third variable
package basic;

import java.util.Scanner;

class SwapTest1 
{
	public static void main(String[] args) 
	{
		int a, b, c;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers");
		a = s.nextInt();
		b = s.nextInt();

		System.out.println("Before swapping a=" + a + " b=" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping a=" + a + " b=" + b);
	}
}
