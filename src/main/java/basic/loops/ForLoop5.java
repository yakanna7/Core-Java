/*Java program to check whether given number is perfect number or not
 Perfect Number: If sum of all factors of a number excluding itself is equal to
 the same number then it a perfect number.
 Example: 6 and 28 are perfect numbers 
 */

package basic.loops;

import java.util.Scanner;

class ForLoop5 
{
	public static void main(String[] args)
	{
		int num, i, factorsSum=0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();
		
		for (i = 1; i <=num/2; i++)
		{
			if(num%i==0)
			{
				factorsSum+=i;
			}
		}
		
		if(factorsSum == num)
		{
		   System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is not a perfect number");
		}
	}
}
