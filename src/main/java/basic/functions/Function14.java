//Java program to find power value using recursive function

package basic.functions;

import java.util.Scanner;

class Function14 
{
	static long power(int base, int exponent)
	{
		if(exponent == 0)
		{
			return 1;
		}
		else
		{
			return base*power(base,exponent-1 );
		}
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
