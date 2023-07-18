//Java program to check whether given year is a leap year or not
package basic.control_statements;

import java.util.Scanner;

class ElseIfLadder3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any year number");
		int year = s.nextInt();

		if (year > 0)
		{
			if (year % 400 == 0)
			{
				System.out.println(year + " is a leap year");
			} 
			else if (year % 100 == 0)
			{
				System.out.println(year + " is a not a leap year");
			} 
			else if (year % 4 == 0)
			{
				System.out.println(year + " is a leap year");
			} 
			else
			{
				System.out.println(year + " is a not a leap year");
			}
		} 
		else
		{
			System.out.println("Year number must be positive");
		}
	}
}
