/*Java program to check whether given number is 
  prime or not using break statement
 */
package basic.loops.jumping;

import java.util.Scanner;

class BreakStatement2 
{
	public static void main(String[] args)
	{
		int num, i;
        boolean isPrime=true;
        
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		if (num == 2)
		{
			System.out.println("2 is a prime number");
		} 
		else if (num % 2 == 0)
		{
			System.out.println(num + " is not a prime number");
		} 
		else 
		{
			for (i = 2; i <= num/2; i++) 
			{
				if (num % i == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime)
			{
				System.out.println(num + " is a prime number");
			} 
			else 
			{
				System.out.println(num + " is not a prime number");
			}
		}
	}
}
