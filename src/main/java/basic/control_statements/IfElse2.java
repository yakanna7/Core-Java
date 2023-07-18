//Java program to check whether given number is even or odd
package basic.control_statements;

import java.util.Scanner;

class IfElse2 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		int num = s.nextInt();

		if (num % 2 == 0) 
		{
			System.out.println(num + " is an even number");
		} 
		else 
		{
			System.out.println(num + " is an odd number");
		}
	}
}
