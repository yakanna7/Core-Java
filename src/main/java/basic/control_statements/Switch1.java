/*Java program to display name of the day when day number is entered 
from 1 to 7 */

package basic.control_statements;

import java.util.Scanner;

class Switch1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any day number from 1 to 7");
		int day = s.nextInt();

		switch (day)
		{
		   case 1:
				System.out.println("Day is Sunday");
				break;
			case 2:
				System.out.println("Day is Monday");
				break;
			case 3:
				System.out.println("Day is Tuesday");
				break;
			case 4:
				System.out.println("Day is Wednesday");
				break;
			case 5:
				System.out.println("Day is Thursday");
				break;
			case 6:
				System.out.println("Day is Friday");
				break;
			case 7:
				System.out.println("Day is Saturday");
				break;
			default:
				System.out.println("Invalid Day Number Was Entered");
				System.out.println("Please Enter The Day Number Between 1 to 7");
				break;
		}
	}
}
