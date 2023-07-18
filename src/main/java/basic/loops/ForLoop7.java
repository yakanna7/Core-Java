/*Java program to display first n number of fibonacci series values
 * Fibonacci series is a series of numbers where the current number is the sum of previous two terms. 
   For Example: 0, 1, 1, 2, 3, 5, 8, 13, 21... 
 */

package basic.loops;

import java.util.Scanner;

class ForLoop7 
{
	public static void main(String[] args)
	{
		int num, i, a, b = 1, c = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of fibonacci series values you want to display");
		num = s.nextInt();

		for (i = 1; i <= num; i++)
		{
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;
		}
	}
}
