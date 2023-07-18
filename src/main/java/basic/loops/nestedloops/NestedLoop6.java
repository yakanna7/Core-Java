//Java program to display all strong numbers between 1 to given number
package basic.loops.nestedloops;

import java.util.Scanner;

class NestedLoop6
{
	public static void main(String[] args)
	{
		int number, num, n, i, fact, sum, digit;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		number = s.nextInt();
	
		System.out.println("All strong numbers between 1 and "+number+" are");
		
		for (num = 1; num <= number; num++)
		{
			n = num;
			sum =0;
			
			while (n > 0)
			{
				fact = 1;
				digit = n % 10;

				for (i = 1; i <= digit; i++)
				{
					fact = fact * i;
				}

				sum = sum + fact;
				n = n / 10;
			}

			if (sum == num)
			{
				System.out.println(num);
			}
		}
	}
}
