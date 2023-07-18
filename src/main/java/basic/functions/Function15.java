//Java program to find sum of individual digits using recursive function
package basic.functions;

import java.util.Scanner;

class Function15
{
	static long getDigitsSum(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		else
		{
			return ((num % 10) + getDigitsSum(num / 10));
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		int n = s.nextInt();

		System.out.println("Sum of all digits of number "+n+" is "+getDigitsSum(n));
	}
}
