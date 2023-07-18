//Java program to display all numbers from 1 to given number
package basic.loops;

import java.util.Scanner;

class WhileLoop2
{
	public static void main(String[] args)
	{
		int num, i = 1;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		System.out.println("All numbers between 1 and " + num + " are");
		while (i <= num)
		{
			System.out.println(i);
			i++;
		}
	}
}
