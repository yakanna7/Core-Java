//Java program to check whether give number is divisible by 5
package basic.control_statements;

import java.util.Scanner;

class IfStatement 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();

		System.out.println("Given number is " + num);

		if (num % 5 == 0) 
		{
			System.out.println(num + " is divisible by 5");
		}
	}
}
