//Java program to display number of days in a given month
package basic.control_statements;

import java.util.Scanner;

class ElseIfLadder2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter month number between 1 to 12");
		int month = s.nextInt();

		if (month == 2)
		{
			System.out.println("Month 2 contains 28 or 29 days");
		} 
		else if (month == 1 || month == 3 || month == 5 || month == 7
				|| month == 8 || month == 10 || month == 12) 
		{
			System.out.println("Month " + month + " contains 31 days");
		} 
		else if (month == 4 || month == 6 || month == 9 || month == 11) 
		{
			System.out.println("Month " + month + " contains 30 days");
		} 
		else
		{
			System.out.println("Invalid month number entered");
			System.out.println("Please enter month number between 1 to 12");
		}
	}
}
