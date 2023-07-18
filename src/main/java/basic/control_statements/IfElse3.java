//Java program to find maximum of two numbers
package basic.control_statements;

import java.util.Scanner;

class IfElse3
{
	public static void main(String[] args)
	{
		int a, b;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter two number");
		a = s.nextInt();
		b = s.nextInt();

		if (a > b)
		{
			System.out.println("Maximum value is " + a);
		} 
		else 
		{
			System.out.println("Maximum value is " + b);
		}
	}
}
