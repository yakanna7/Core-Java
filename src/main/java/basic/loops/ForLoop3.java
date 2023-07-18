//Java program to find factorial value of a given number
package basic.loops;

import java.util.Scanner;

class ForLoop3
{
	public static void main(String[] args)
	{
		int num, i;
		long fact = 1;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		for (i = 1; i <= num; i++) 
		{
			fact = fact * i;
		}

		System.out.println("Factorial value of " + num + " is " + fact);
	}
}
