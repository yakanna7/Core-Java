//Java enum example program
package java5.enums;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumTest1 
{
	public static void main(String args[])
	{
		Day day = Day.MONDAY;

		switch (day)
		{
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
}
