//Java example program to access current date in different ways
package packages.java.util;

public class DateAccessor {
	public static void main(String args[]) 
	{
		java.util.Date date1 = new java.util.Date();
		
		long millis = System.currentTimeMillis();
		java.util.Date date2 = new java.util.Date(millis);
		java.sql.Date date3 = new java.sql.Date(millis);
		java.util.Date date4 = java.util.Calendar.getInstance().getTime();
		
		System.out.println("Date using Date class      "+date1);
		System.out.println("Date using util.Date class "+date2);
		System.out.println("Date using sql.Date  class "+date3);
		System.out.println("Date using Calendar  class "+date4);
	}
}
