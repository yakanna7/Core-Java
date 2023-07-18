/*Java program to implement a function to check whether 
given year is a leap year or not*/

package basic.functions;

import java.util.Scanner;

class Function11
{
	static boolean isLeapYear(int year) 
	{
		if (year % 400 == 0)
			return true;
		else if (year % 100 == 0)
			return false;
		else if (year % 4 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any year number");
		int n = s.nextInt();

		if (isLeapYear(n))
		{
			System.out.println(n + " is a leap year");
		} 
		else
		{
			System.out.println(n + " is not a leap year");
		}
	}
}
