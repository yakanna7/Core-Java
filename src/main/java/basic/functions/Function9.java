/*Java program to implement a function to find reverse 
number of a given number*/

package basic.functions;

import java.util.Scanner;

class Function9
{
	static int getReverse(int num) 
	{
		int reverseNumber = 0, rem;
		while (num > 0) 
		{
			rem = num % 10;
			reverseNumber = reverseNumber * 10 + rem;
			num = num / 10;
		}
		return reverseNumber;
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		int n = s.nextInt();

		System.out.println("Reverse number is " + getReverse(n));
	}
}
