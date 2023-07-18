//Java program to display number of days in a given month
package basic.control_statements;

import java.util.Scanner;

class Switch3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter month number between 1 to 12");
		int month = s.nextInt();

		switch (month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Month " + month + " contains 31 days");
				break;
	
			case 2:
				System.out.println("Month 2 contains 28 or 29 days");
				break;
	
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Month " + month + " contains 30 days");
				break;
	
			default:
				System.out.println("Invalid month number entered");
				System.out.println("Please enter month number between 1 to 12");
				break;
		}
	}
}
