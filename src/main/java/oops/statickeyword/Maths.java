// Java program to implement static method
package oops.statickeyword;

import java.util.*;

class Maths {

	public static long power(int base, int index) {
		long pw = 1;
		for (int i = 1; i <= index; i++) {
			pw = pw * base;
		}
		return pw;
	}

	public static void main(String args[]) {
		int num, p;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter base and index value");
		num = s.nextInt();
		p = s.nextInt();
		System.out.println(num + " power " + p + " is " + Maths.power(num, p));
	}
}