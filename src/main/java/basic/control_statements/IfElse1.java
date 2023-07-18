//Java program to check whether give number is divisible by 5 or not
package basic.control_statements;

import java.util.Scanner;

public class IfElse1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();

		if (num % 5 == 0)
		{
			System.out.println(num + " is divisible by 5");
		} 
		else 
		{
			System.out.println(num + " is not divisible by 5");
		}
	}
}
