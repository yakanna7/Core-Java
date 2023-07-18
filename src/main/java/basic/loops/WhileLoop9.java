/*Java program to find number of even and odd digits and even and odd
digits sum separately in a given number*/

package basic.loops;

import java.util.Scanner;

class WhileLoop9 
{
	public static void main(String args[])
	{
		long num; 
		int evenDigits = 0, oddDigits = 0, evenDigitsSum = 0, oddDigitsSum = 0, rem;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextLong();

		while (num > 0)
		{
			rem = (int)(num % 10);

			if (rem % 2 == 0)
			{
				evenDigits++;
				evenDigitsSum += rem;
			} 
			else
			{
				oddDigits++;
				oddDigitsSum += rem;
			}
			
			num = num / 10;
		}

		System.out.println("Total number of even digits: " + evenDigits);
		System.out.println("Total number of odd digits: " + oddDigits);

		System.out.println("All even digits sum is: " + evenDigitsSum);
		System.out.println("All odd digits sum is: " + oddDigitsSum);
	}
}
