/*Java program to implement a function to check whether 
given number is number or not*/

package basic.functions;

import java.util.Scanner;

class Function12
{
	static boolean isPrime(int num) 
	{
		boolean isPrime = true;

		if (num == 2) 
		{
			return true;
		} 
		else if (num % 2 == 0)
		{
			return false;
		} 
		else
		{
			for (int i = 2; i <= num / 2; i++)
			{
				if (num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		int n = s.nextInt();

		if (isPrime(n)) 
		{
			System.out.println(n + " is a prime number");
		} 
		else
		{
			System.out.println(n + " is not a prime number");
		}
	}
}
