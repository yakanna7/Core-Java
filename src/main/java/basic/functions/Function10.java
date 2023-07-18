/*Java program to implement a function to check whether 
given number is even or odd*/

package basic.functions;

import java.util.Scanner;

class Function10 
{
	static boolean isEven(int num)
	{
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		int n = s.nextInt();

		if (isEven(n))
		{
			System.out.println(n + " is an even number");
		} 
		else
		{
			System.out.println(n + " is an odd number");
		}
	}
}
