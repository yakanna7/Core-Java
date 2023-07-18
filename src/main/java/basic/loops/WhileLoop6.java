//Java program to display all numbers from given number to 1
package basic.loops;

import java.util.Scanner;

class WhileLoop6 
{
	public static void main(String[] args)
	{
		int num;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		System.out.println("All numbers from " + num + " to 1 are");
		while (num > 0) 
		{
			System.out.println(num);
			num--;
		}
	}
}
