// Java java.util.Date class basic methods.
package packages.java.util;

import java.util.Date;

public class UtilDateTest
{
	public static void main(String args[]) 
	{
		Date d1 = new Date();
		long millisec = System.currentTimeMillis();
		Date d2 = new Date(millisec);

		System.out.println("First date is:   " + d1);
		System.out.println("Second date is : " + d2);

		if (d1.equals(d2)) 
		{
			System.out.println("Both the dates are euqal");
		} 
		else
		{
			System.out.println("Both the dates are not equal");
		}

		long twoDays = 1000 * 60 * 60 * 24 * 2;

		d1.setTime(millisec + twoDays);
		System.out.println("Date fater two days " + d1);

		if (d1.compareTo(d2) < 0)
			System.out.println(d1 + " is earlier than " + d2);
		else if (d1.compareTo(d2) > 0)
			System.out.println(d1 + " is later than " + d2);
		else
			System.out.println(d1 + " is equal to " + d2);
	}
}
