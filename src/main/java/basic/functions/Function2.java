/*Java program to implement a function to find sum of two numbers
using with arguments and no return type*/

package basic.functions;

import java.util.Scanner;

class Function2
{
	static void sum(int a, int b)
	{
		System.out.println("Sum is " + (a + b));
	}

	public static void main(String[] args)
	{
		int x, y;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers");
		x = s.nextInt();
		y = s.nextInt();

		sum(x, y);
	}
}
