/*Java program to implement a function to find power of any number 
by using given  base and exponent*/

package basic.functions;

import java.util.Scanner;

class Function8
{
	static long power(int base, int exponent)
	{
		long pw = 1;

		for (int i = 1; i <= exponent; i++)
		{
			pw = pw * base;
		}

		return pw;
	}

	public static void main(String[] args)
	{
		int bs, exp;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter base value");
		bs = s.nextInt();
		System.out.println("Enter exponent value");
		exp = s.nextInt();

		System.out.println(bs + " power " + exp + " is " + power(bs, exp));
	}
}
