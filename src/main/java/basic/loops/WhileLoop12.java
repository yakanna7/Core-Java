//Java program to find reverse number of a given number

package basic.loops;

import java.util.Scanner;

class WhileLoop12 
{
	public static void main(String args[])
	{
		int num,reverseNumber = 0, rem;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		while (num > 0)
		{
			rem = num % 10;
			reverseNumber = reverseNumber*10 + rem;
			num = num / 10;
		}

		System.out.println("Reverse number is " + reverseNumber);
	}
}
