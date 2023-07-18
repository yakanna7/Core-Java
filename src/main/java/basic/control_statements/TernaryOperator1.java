/*Java program to find maximum of two numbers using ternary or conditional 
operator*/
package basic.control_statements;

import java.util.Scanner;

class TernaryOperator1 
{
	public static void main(String[] args) 
	{
		int a, b, max;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter two number");
		a = s.nextInt();
		b = s.nextInt();

		max = (a > b) ? a : b;
		System.out.println("Maximum value is " + max);
	}
}
