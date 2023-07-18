//Java program to find number of digits in a given number

package basic.loops;

import java.util.Scanner;

class WhileLoop8
{
	public static void main(String args[])
	{
		long num;
		byte digits = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextLong();

		while (num > 0)
		{
			digits++;
			num = num / 10;
		}

		System.out.println("Given number is a  " + digits + " digit number");
	}
}
