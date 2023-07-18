//Java program to display all numbers from given number to 1
package basic.loops;

import java.util.Scanner;

class ForLoop9 
{
	public static void main(String[] args) 
	{
		int num, n;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		for (n = num; n > 0; n--) 
		{
			System.out.println(n);
		}
	}
}
