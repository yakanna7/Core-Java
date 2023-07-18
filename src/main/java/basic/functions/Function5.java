/*Java program to implement a function to find square value using
with arguments and with return type*/

package basic.functions;

import java.util.Scanner;

class Function5
{
	static int square(int num)
	{
		return (num * num);
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		int n = s.nextInt();

		int sq = square(n);
		System.out.println("Square value of " + n + " is " + sq);
	}
}
