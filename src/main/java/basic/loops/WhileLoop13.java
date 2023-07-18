/*Java program to check whether given number is palindrome or not.
 If a number and it's reverse number both are equal then it is a 
 palindrome number. Example: 232 reverse number is also 232
 */

package basic.loops;

import java.util.Scanner;

class WhileLoop13
{
	public static void main(String args[]) 
	{
		int num, n, reverseNumber = 0, rem;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();
		n = num;

		while (num > 0) 
		{
			rem = num % 10;
			reverseNumber = reverseNumber * 10 + rem;
			num = num / 10;
		}

		if (reverseNumber == n)
		{
			System.out.println(n + " is a palindrome number");
		} 
		else
		{
			System.out.println(n + " is not a palindrome number");
		}
	}
}
