//Java program to find maximum of three numbers
package basic.control_statements;

import java.util.Scanner;

class ElseIfLadder1
{
	public static void main(String[] args)
	{
		int a, b, c;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter three numbers");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		if (a > b && a > c)
		{
			System.out.println("Maximum value is " + a);
		} 
		else if (b > c)
		{
			System.out.println("Maximum value is " + b);
		}
		else
		{
			System.out.println("Maximum value is " + c);
		}
	}
}
