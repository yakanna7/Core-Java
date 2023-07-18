/*Java program to find sum of all individual digits of a given number
 Example: 2345 -> 2+3+4+5 =14
 */
package basic.loops;

import java.util.Scanner;

class WhileLoop7 
{
	public static void main(String args[])
	{
		int num, sum = 0, rem;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		while (num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}

		System.out.println("Sum of all digits is " + sum);
	}
}
