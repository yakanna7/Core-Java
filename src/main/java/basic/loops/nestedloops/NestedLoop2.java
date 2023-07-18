/*Java program to display all prime numbers between 1 to given number and 
find those prime numbers sum*/
package basic.loops.nestedloops;

import java.util.Scanner;

class NestedLoop2
{
	public static void main(String[] args)
	{
		int num, i, j;
		long sum =2;
		boolean isPrime;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();
		
		System.out.println("All prime numbers between 1 and "+num+" are\n2");

		for (i = 3; i <= num; i = i + 2)
		{
			isPrime = true;
			
			for (j = 2; j <= (i / 2); j++)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}	
			}
			
			if (isPrime)
			{
				System.out.println(i);
				sum = sum+i;
			}
		}
		
		System.out.println("All prime numbers sum is "+sum);
	}
}
