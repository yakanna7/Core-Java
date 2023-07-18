/*Java program to implement a function to display multiplication table
of a given number using with arguments and no return type*/
package basic.functions;

import java.util.Scanner;

class Function3
{
	static void printTable(int num) 
	{
		System.out.println("Multiplication table of " + num + " is");
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num + "*" + i + " = " + (num * i));
		}
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter multiplication table number");
		int n = s.nextInt();

		printTable(n);
	}
}
