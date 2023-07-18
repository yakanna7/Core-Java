//Java program to display all perfect numbers between 1 to given number
package basic.loops.nestedloops;

import java.util.Scanner;

class NestedLoop5
{
	public static void main(String[] args)
	{
		int num, n, i, factorsSum;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		System.out.println("All perfect numbers between 1 and " + num + " are");
		for (n = 1; n <= num; n++)
		{
			factorsSum = 0;
			
			for (i = 1; i <= n / 2; i++) 
			{
				if (n % i == 0) 
				{
					factorsSum += i;
				}
			}

			if (factorsSum == n)
			{
				System.out.println(n);
			}
		}
	}
}
