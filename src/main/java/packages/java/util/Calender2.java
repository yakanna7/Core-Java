//Java example program to implement GregorianCalendar
package packages.java.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calender2 {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();

		// set date to 2 Sep 1992
		calendar.set(Calendar.YEAR, 1992);
		calendar.set(Calendar.MONTH, 8); // 8 = September
		calendar.set(Calendar.DAY_OF_MONTH, 2);

		Date dt = calendar.getTime();
		System.out.println("Date is " + dt);
		// add one day
		calendar.add(Calendar.DAY_OF_MONTH, 1);  
        dt = calendar.getTime();
		System.out.println("After adding one day Date is "+dt);
		
		// subtract one year
	    calendar.add(Calendar.YEAR, -1);
	    dt = calendar.getTime();
		System.out.println("After subtracting one year Date is "+dt);
	}
}
