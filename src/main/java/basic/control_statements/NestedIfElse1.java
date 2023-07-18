//Java program to check whether a person is eligible to vote or not
package basic.control_statements;

import java.util.Scanner;

class NestedIfElse1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Eneter person age");
		int age = s.nextInt();

		if (age >= 1 && age <= 120)
		{
			if (age >= 18)
			{
				System.out.println("Person is eligible to vote");
			} 
			else 
			{
				System.out.println("Person is not eligible to vote");
			}
		} 
		else
		{
			System.out.println("Invalid age entered");
			System.out.println("Please enter age between 1 to 120");
		}
	}
}
