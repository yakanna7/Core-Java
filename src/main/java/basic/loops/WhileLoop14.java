/*Java program to check whether given number is an Armstrong number or not.
 If sum of cubes of all individual digits of a given number is equal to the same
 number then it is an Armstrong number.
 Example: 1, 153, 370, 371, 407
 */

package basic.loops;

import java.util.Scanner;

class WhileLoop14
{
	public static void main(String args[])
	{
		int num, n, sum = 0, rem;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();
		n = num;

		while (num > 0)
		{
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}

		if (sum == n)
		{
			System.out.println(n + " is an Armstrong number");
		} 
		else
		{
			System.out.println(n + " is not an Armstrong number");
		}
	}
}
