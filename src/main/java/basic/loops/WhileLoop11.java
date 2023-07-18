//Java program to find sum of first and last digit of a given number
package basic.loops;

import java.util.Scanner;

class WhileLoop11 
{
	public static void main(String[] args)
	{
		int num, n, sum=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number");
		num = s.nextInt();
		n = num;
		
		while(num>0)
		{
			if(num==n || num<=9)
			{
				sum = sum+(num%10);
			}
			num = num/10;
		}
		
		System.out.println("Sum of first and last digit is "+sum);
	}
}
