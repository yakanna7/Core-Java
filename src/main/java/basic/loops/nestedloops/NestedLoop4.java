//Java program to display all Armstrong numbers between 1 to given number 
package basic.loops.nestedloops;

import java.util.Scanner;

class NestedLoop4 
{
	public static void main(String[] args)
	{
		int num, n, sum, rem;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		System.out.println("All Armstrong numbers between 1 and "+num+" are");
		
		for (int i = 1; i <= num; i++)
		{
			n = i;
			sum = 0;
			
			while (n > 0)
			{
				rem = n % 10;
				sum = sum + (rem * rem * rem);
				n = n / 10;
			}

			if (sum == i)
			{
				System.out.println(i);
			}
		}
	}
}
