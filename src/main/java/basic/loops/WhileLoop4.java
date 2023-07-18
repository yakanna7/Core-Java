//Java program to find sum of all numbers between 1 to given number
package basic.loops;

import java.util.Scanner;

class WhileLoop4
{
	public static void main(String args[])
	{
		int num, i = 1, sum = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		while (i <= num)
		{
			sum = sum + i;
			i++;
		}

		System.out.println("Sum of all numbers between 1 and " + num + " is " + sum);
	}
}
