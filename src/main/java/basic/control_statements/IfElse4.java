//Java program to check whether a person is eligible to vote or not
package basic.control_statements;

import java.util.Scanner;

class IfElse4
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Eneter person age");
		int age = s.nextInt();

		if (age >= 18)
		{
			System.out.println("Person is elizible to vote");
		} 
		else 
		{
			System.out.println("Person is not elizible to vote");
		}
	}
}
