//Java program to check whether given number is prime or not

package basic.loops;

import java.util.Scanner;

class ForLoop4
{
	public static void main(String[] args)
	{
		int num, i, factorsCount = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		for (i = 1; i <= num; i++)
		{
			if (num % i == 0)
			{
				factorsCount++;
			}
		}

		if (factorsCount == 2)
		{
			System.out.println(num + " is a prime number");
		} 
		else
		{
			System.out.println(num + " is not a prime number");
		}
	}
}
