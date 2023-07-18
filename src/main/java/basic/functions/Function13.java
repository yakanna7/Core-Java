/*Java program to find factorial value of a given number 
using recursive function*/

package basic.functions;

import java.util.Scanner;

class Function13 
{
	static long factValue(int num) 
	{
		if (num == 0 || num == 1)
		{
			return 1;
		} 
		else
		{
			return num * factValue(num - 1);
		}
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		int n = s.nextInt();

		System.out.println("Factorial value of " + n + " is " + factValue(n));
	}
}
