//Java program to find power of any number by using given  base and exponent
package basic.loops;

import java.util.Scanner;

class ForLoop8 
{
	public static void main(String[] args) 
	{
		int base, exponent, i;
		long power = 1;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter base value");
		base = s.nextInt();
		System.out.println("Enter exponent value");
		exponent = s.nextInt();

		for (i = 1; i <= exponent; i++)
		{
			power = power * base;
		}

		System.out.println(base + " power " + exponent + " is " + power);
	}
}
