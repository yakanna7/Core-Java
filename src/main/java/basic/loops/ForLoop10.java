//Java program to find reverse number of a given number

package basic.loops;

import java.util.Scanner;

class ForLoop10
{
	public static void main(String[] args)
	{
		int num, n, reverseNumber = 0, rem;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		for (n = num; n > 0; n = n / 10)
		{
			rem = n % 10;
			reverseNumber = reverseNumber * 10 + rem;
		}

		System.out.println("Reverse number is " + reverseNumber);
	}
}
