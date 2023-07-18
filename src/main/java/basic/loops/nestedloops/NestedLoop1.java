/*Java program to check whether given number is strong number or not
Strong number is the numbers whose all digits factorial sum is equal to the same number. 
Example: 145 is a strong number
Since 1! + 4! + 5! = 145 
 */

package basic.loops.nestedloops;

import java.util.Scanner;

class NestedLoop1 
{
	public static void main(String[] args)
	{
		int num, n, i, fact, sum = 0, digit;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();
		n = num;
		
		while(n > 0)
		{
			fact = 1;
			digit = n % 10;

			for (i = 1; i <= digit; i++)
			{
				fact = fact * i;
			}

			sum = sum + fact;
			n = n / 10;
		}

		if (sum == num)
		{
			System.out.println(num + " is a strong number");
		} 
		else 
		{
			System.out.println(num + " is not a strong number");
		}
	}
}


//http://www.codeforwin.in/2015/06/for-do-while-loop-programming-exercises.html
