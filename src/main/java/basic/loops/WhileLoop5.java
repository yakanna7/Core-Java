//Java program to find sum of all even and odd numbers between 1 to given number
package basic.loops;

import java.util.Scanner;

class WhileLoop5 
{
	public static void main(String args[]) 
	{
		int num, i = 1, evenSum = 0, oddSum = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		while (i <= num)
		{
			if (i % 2 == 0)
				evenSum = evenSum + i;
			else
				oddSum = oddSum + i;

			i++;
		}

		System.out.println("Sum of all even numbers between 1 and " + num
				+ " is " + evenSum);
		System.out.println("Sum of all odd numbers between 1 and " + num
				+ " is " + oddSum);
	}
}
