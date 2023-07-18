//Java program to display all prime factors of a given number
package basic.loops.nestedloops;

import java.util.Scanner;

class NestedLoop3 
{
	public static void main(String[] args) 
	{
		int num, i, j;
		boolean isPrime;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		System.out.println("All prime factors are");

		for (i = 2; i <= num; i++)
		{
			isPrime = true;

			if (num % i == 0)
			{
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
				}
			}	
		}
	}
}

//http://www.codeforwin.in/2015/06/for-do-while-loop-programming-exercises.html
