package packages.java.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
	public static void main(String a[]) {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(dNow));
	}
}
