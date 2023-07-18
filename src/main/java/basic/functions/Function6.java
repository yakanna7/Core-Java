/*Java program to implement a function to find maximum of three
numbers using with arguments and with return type*/

package basic.functions;

import java.util.Scanner;

class Function6 
{
	static int max(int a, int b, int c)
	{
		if (a > b && a > c)
			return a;
		else if (b > c) // In single line you can write
			return b; // return (a>b && a>c)?a:(b>c)?b:c;
		else
			return c;
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter three numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		System.out.println("Maximum value is " + max(a, b, c));
	}
}
