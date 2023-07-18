//Java program to display season name based on entered month name
package basic.control_statements;

import java.util.Scanner;

class Switch5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first three characters of any month name in lowercase.");
		String month = s.next();

		switch (month)
		{
			case "nov":
			case "dec":
			case "jan":
			case "feb":
				System.out.println("It is WINTER season.");
				System.out.println("Wear sweater to keep you warm.");
				break;
	
			case "mar":
			case "apr":
			case "may":
			case "jun":
				System.out.println("It is SUMMER season.");
				System.out.println("Use A/C to keep you cool.");
				break;
	
			case "jul":
			case "aug":
			case "sep":
			case "oct":
				System.out.println("It is RAINY season.");
				System.out.println("Takeaway umbrella where ever you go.");
				break;
	
			default:
				System.out.println("Invalid month name entered.");
				break;
		}
	}
}
