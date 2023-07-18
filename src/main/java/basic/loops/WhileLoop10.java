//Java program to find minimum and maximum digit in a given number

package basic.loops;

import java.util.Scanner;

class WhileLoop10
{
	public static void main(String args[])
	{
		long num;
		byte minDigit = 9, maxDigit = 0, rem;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextLong();

		while (num > 0) 
		{
			rem = (byte) (num % 10);

			if (rem < minDigit) 
			{
				minDigit = rem;
			}

			if (rem > maxDigit)
			{
				maxDigit = rem;
			}

			num = num / 10;
		}

		System.out.println("Minimum digit is " + minDigit);
		System.out.println("Maximum digit is " + maxDigit);
	}
}
