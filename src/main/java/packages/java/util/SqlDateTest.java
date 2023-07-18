//Java example to implement java.util.Date class methods
package packages.java.util;

import java.sql.Date;

public class SqlDateTest
{
	public static void main(String args[]) 
	{
		long millis = System.currentTimeMillis();
		Date today = new Date(millis);
		System.out.println("Today date is " + today);
		String dob = "1987-03-05"; // yyyy-mm-dd
		Date myDob = Date.valueOf(dob);// converting string into sql date
		System.out.println("My date of birth is " + myDob);
	}
}
