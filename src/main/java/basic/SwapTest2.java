//17.Java program to swap two numbers without using third variable
package basic;

import java.util.Scanner;

class SwapTest2 
{
	public static void main(String[] args)
	{
		int a, b;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers");
		a = s.nextInt();
		b = s.nextInt();

		System.out.println("Before swapping a=" + a + " b=" + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping a=" + a + " b=" + b);
	}
}
